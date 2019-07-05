package com.pl3nny.Roulette;

public class VipPlayer extends Player
{
    private int id;
    private String name;

    public VipPlayer(double cash, int id, String name)
    {
        super(cash);
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
