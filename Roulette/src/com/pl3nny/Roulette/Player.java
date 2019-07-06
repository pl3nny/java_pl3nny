package com.pl3nny.Roulette;

public class Player
{
    private double cash;
    private String color;
    private int playersNumGuess;

    public Player (double cash)
    {
        this.cash = cash;
    }

    public void setCash(double cash)
    {
        this.cash = cash;
    }

    public double getCash()
    {
        return this.cash;
    }

    public void addCash(double cash)
    {
        this.cash += cash;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setPlayersNumGuess(int playersNumGuess)
    {
        this.playersNumGuess = playersNumGuess;
    }

    public int getPlayersNumGuess()
    {
        return playersNumGuess;
    }

    public void playerInfo(int playerNum)
    {
        System.out.println("Player " + (playerNum + 1) + " Cash: $" + cash);
    }
}
