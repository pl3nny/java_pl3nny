package com.pl3nny.Roulette;

public class Roulette extends Game
{
    private int houseChips;

    public Roulette(int numOfPlayers, int houseChips)
    {
        super(numOfPlayers);
        this.houseChips = houseChips;

        generateSetNumberOfPlayers();
    }

    public int getPlayerCash(int playerNum)
    {
        if(getPlayers()[playerNum].isVip())
        {
            return getPlayers()[playerNum].getVipPlayer().getCash();
        }
        else
        {
            return getPlayers()[playerNum].getPlayer().getCash();
        }
    }

    public int getVipPlayerID(int playerNum)
    {
        if(getPlayers()[playerNum].isVip())
        {
            return getPlayers()[playerNum].getVipPlayer().getId();
        }
        else
        {
            System.out.println("This player is not a VIP player...");
            return 0;
        }
    }

    public String getVipPlayerName(int playerNum)
    {
        if(getPlayers()[playerNum].isVip())
        {
            return getPlayers()[playerNum].getVipPlayer().getName();
        }
        else
        {
            System.out.println("This player is not a VIP player...");
            return null;
        }
    }

    public String getPlayerInfo(int playerNum)
    {
        if(getPlayers()[playerNum].isVip())
        {
            return ("ID: " + getVipPlayerID(playerNum) + " Name: "
                    + getVipPlayerName(playerNum)
                    + " Cash: $" + getPlayerCash(playerNum));
        }
        else
        {
            return ("Player " + (playerNum + 1) + " Cash: $" + getPlayerCash(playerNum));
        }
    }

}
