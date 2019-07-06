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

    @Override
    public void playerInfo(int playerNum)
    {
        System.out.println("Name: " +name + " ID: " + id + " Cash: $" + getCash());
    }
}
