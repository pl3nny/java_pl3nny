package com.pl3nny.Roulette;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Author: Alexander Hernandez\n");
        System.out.println("\tRoulette\n");

        int numOfPlayers;
        System.out.print("Enter number of players: ");
        numOfPlayers = scan.nextInt();

        Game game = new Game(numOfPlayers);

        int answer = 0;
        System.out.println("1.\tSingle Zero Wheel" +
                "\n2.\tDouble Zero Wheel");
        System.out.print("Choose game Type: ");
        answer = scan.nextInt();
        switch (answer)
        {
            case 1:
                System.out.println("\n\tSingle Zero Wheel Roulette\n");
                game.getRoulette().setSingleWheel(true);
                game.setUpPlayers();
                game.getRoulette().printSingleZeroWheel();
                game.placeNumberBet();
                game.gameResults();
                break;
            case 2:
                game.getRoulette().setDoubleWheel(true);
                System.out.println("\n\tDouble Zero Wheel Roulette\n");
                game.setUpPlayers();
                game.getRoulette().printDoubleZeroWheel();
                game.placeNumberBet();
                game.gameResults();
                break;
        }
    }
}
