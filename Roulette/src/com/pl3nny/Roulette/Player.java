package com.pl3nny.Roulette;

public class Player
{
    private double cash;

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
}
