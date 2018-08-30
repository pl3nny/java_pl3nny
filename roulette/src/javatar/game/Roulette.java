package javatar.game;

import java.util.Scanner;

public class Roulette 
{

	Scanner scan = new Scanner(System.in);

	private String gameVersion;
    private int numOfPlayers;
    private double houseMoney = 100000;
    private int houseChips;

    // game version 1
    // single zero roulette
    // 0-32-15-19-4-21-2-25-17-34-6-27-13-36-11-30-8-23-10-5-24-16-
    //33-1-20-14-31-9-22-18-29-7-28-12-35-3-26

    private int singleZero[] = {0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6,
     27, 13, 36, 11, 30, 8, 23, 10, 5, 24, 16, 33, 2, 18, 29, 7, 28,
      12, 28, 12, 35, 3, 26};

   	// game version 2
    // double zero roulette   ---> -2 for double zero (00)
    // 0-28-9-26-30-11-7-20-32-17-5-22-34-15-3-24-36-13-1-00-27-10-25
    //-29-12-8-19-31-18-6-21-33-16-4-23-35-14-2

    private int doubleZero[] = {0, 28, 9, 26, 30, 11, 7, 20, 32, 17, 5,
     22, 34, 15, 3, 24, 36, 13, 1, -2, 27, 10, 25, 29, 12, 8, 1, 9, 31,
      18, 6, 21, 33, 16, 4, 23, 35, 14, 2};


    Roulette(){};
    
    Roulette(String gameVersion, int numOfPlayers)
    {
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
    	double moneyToChips = 0;

    	if(gameVersion.equals("100A"))
    	{
    		while(money > 1)
    		{
    			selection = scan.nextInt();
	    		switch(selection)
	    		{
	    			case 1:
	    				break;
	    			case 20:
	    				break;
	    			case 50:
	    				break;
	    			case 100:
	    				break;
	    			case 200:
	    				break;
	    			case 1000:
	    				break;

	    		}
    		}

    		return houseChips;
    	}
    	else if(gameVersion.equals("100B"))
    	{
    		return houseChips;
    	}
    	else
    	{
    		return -1;
    	}
    }

    public void spinWheel()
    {

    }
}
