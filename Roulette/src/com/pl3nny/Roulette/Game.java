package com.pl3nny.Roulette;

import java.util.Scanner;

public class Game
{
    private Roulette roulette;
    private Player[] player;
    private int numOfPlayers;
    private Scanner scan = new Scanner(System.in);

    public Game(int numOfPlayers)
    {
        this.numOfPlayers = numOfPlayers;
        player = new Player[numOfPlayers];
        roulette = new Roulette();
    }

    public void createRegPlayer(double cash, int index)
    {
        player[index] = new Player(cash);
    }

    public void createVipPlayer(double cash, int id, String name, int index)
    {
        player[index] = new VipPlayer(cash, id, name);
    }

    public Roulette getRoulette()
    {
        return roulette;
    }

    public void setUpPlayers()
    {
        String answer = "";
        String name;
        int id;
        double cash;

        for (int i = 0; i < numOfPlayers; i++)
        {
            System.out.print("Player vip? (y/n): ");
            answer = scan.next();

            if(answer.equals("y"))
            {
                System.out.print("Enter name: ");
                name = scan.next();
                System.out.print("Enter ID: ");
                id = scan.nextInt();
                System.out.print("Enter cash: $");
                cash = scan.nextDouble();

                createVipPlayer(cash, id, name, i);
            }
            else
            {
                System.out.print("Enter cash: $");
                cash = scan.nextDouble();

                createRegPlayer(cash, i);
            }
            System.out.println();
        }
    }

    public void getPlayersInfo()
    {
        for (int i = 0; i < numOfPlayers; i++)
        {
            player[i].playerInfo(i);
        }
    }

    public void placeNumberBet()
    {
        for (int i = 0; i < numOfPlayers; i++)
        {
            player[i].playerInfo(i);
            System.out.print("Enter number to place bet: ");
            player[i].setPlayersNumGuess(scan.nextInt());
            System.out.println();
        }
    }

    public void placeColorBet()
    {

    }

    public void gameResults()
    {
        roulette.spinWheel();

        System.out.println("\t\tRoulette Wheel\n" +
                "\n\tBall: " + roulette.getBall() + "\t\tColor: " + roulette.getColor() + "\n");

        for(int i = 0; i < numOfPlayers; i++)
        {
            player[i].playerInfo(i);
            if(player[i].getPlayersNumGuess() == roulette.getBall())
            {
                System.out.println("Bet placed on : " + player[i].getPlayersNumGuess() +
                        "\tRoulette ball : " + roulette.getBall());

                System.out.println();
                System.out.println("Roulette ball landed on your number.");
                System.out.println("You won! ");
            }
            else
            {
                System.out.println("Bet placed on : " + player[i].getPlayersNumGuess() +
                        "\tRoulette ball : " + roulette.getBall());

                System.out.println();
                System.out.println("Roulette ball did not land on your number...");
            }
            System.out.println();
        }
    }

}
