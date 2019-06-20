package com.pl3nny.Roulette;

public class Main
{
    public static void main(String[] args)
    {
        // write your code here

        System.out.println("Author: Alexander Hernandez\n");
        System.out.println("\tRoulette\n");

        Players[] players = new Players[2];

        players[0] = new Players(100);
        players[1] = new Players(500, 1234, "John");


//        System.out.println(players[0].getPlayer().getCash());
//        System.out.println(players[1].getVipPlayer().getName() + " ID: " + players[1].getVipPlayer().getId());

        for (int i = 0; i < players.length; i++)
        {
            if(players[i].isVip())
            {
                System.out.println(players[1].getVipPlayer().getName() + " ID: " + players[1].getVipPlayer().getId());
            }
            else
            {
                System.out.println(players[0].getPlayer().getCash());
            }
        }
    }
}
