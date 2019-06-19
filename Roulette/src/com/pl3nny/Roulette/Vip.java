package com.pl3nny.Roulette;

public class Vip extends Player
{
    private String name;
    private int id;

    public Vip(int cash, int id, String name)
    {
        super(cash);
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
