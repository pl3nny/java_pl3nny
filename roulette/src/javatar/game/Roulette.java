package javatar.game;

import java.util.Scanner;

public class Roulette 
{
	private String gameVersion;
    private int numOfPlayers;
    private double houseMoney;
    private int houseChips;

    Roulette(){};
    
    Roulette(String gameVersion, int numOfPlayers)
    {
    	Scanner scan = new Scanner(System.in);

    	this.gameVersion = gameVersion;
    	this.numOfPlayers = numOfPlayers;
    }

    public void setGameVersion(String gameVersion)
    {
    	this.gameVersion = gameVersion;
    }

    public String getGameVersion()
    {
    	return this.gameVersion;
    }

    public void setNumOfPlayers(int numOfPlayers)
    {
    	this.numOfPlayers = numOfPlayers;
    }

    public int getNumOfPlayers()
    {
    	return this.numOfPlayers;
    }

    public void setHouseMoney(double houseMoney)
    {
    	this.houseMoney = houseMoney;
    }

    public double getHouseMOney()
    {
    	return this.houseMoney;
    }

    public void setHouseChips(int houseChips)
    {
    	this.houseChips = houseChips;
    }

    public int getHouseChips()
    {
    	return this.houseChips;
    }

    public int buyChips(double money)
    {
    	int selection;

    	if(gameVersion.equals("100A"))
    	{
    		switch(selection)
    		{
    			
    		}
    	}
    	else if(gameVersion.equals("100B"))
    	{

    	}
    	else
    	{
    		return -1;
    	}
    }
}
