package com.pl3nny.Roulette;

public class Game
{
    private int numOfPlayers;
    private Players[] players;

    public Game(int numOfPlayers)
    {
        this.numOfPlayers = numOfPlayers;
    }

    public void generateSetNumberOfPlayers()
    {
        players = new Players[numOfPlayers];
    }

    public int getNumOfPlayers()
    {
        return numOfPlayers;
    }

    public Players[] getPlayers()
    {
        return players;
    }

}
