package javatar.game;

public class Player 
{
    private String name;
    private double money;
    private int chips;

    Player(){};

    Player(String name, double money)
    {
    	this.name = name;
    	this.money = money;
    }

    public void setName(String name)
    {
    	this.name = name;
    }

    public String getName()
    {
    	return this.name;
    }

    public void setMoney(double money)
    {
    	this.money = money;
    }

    public double getMoney()
    {
    	return this.money;
    }

    public void setChip(int chips)
    {
    	this.chips = chips;
    }

    public int getChips()
    {
    	return this.chips;
    }
}