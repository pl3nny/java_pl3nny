package com.pl3nny.Roulette;

public class Main
{
    public static void main(String[] args)
    {
        // write your code here

        System.out.println("Author: Alexander Hernandez\n");
        System.out.println("\tRoulette\n");

        Roulette roulette = new Roulette(2, 500);

        roulette.getPlayers()[0] = new Players(100);
        roulette.getPlayers()[1] = new Players(500, 1234, "Alex");

        System.out.println(roulette.getPlayerInfo(0));
        System.out.println(roulette.getPlayerInfo(1));

        System.out.println();

        System.out.println("number of players in game: " + roulette.getNumOfPlayers());
    }
}
