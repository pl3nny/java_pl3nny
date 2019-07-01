package com.pl3nny.Roulette;

import java.util.Arrays;

public class Roulette extends Game
{
    private int houseChips;
    private String color;
    private int betNumber;


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

    public void spinWheel()
    {

    }

    public int getHouseChips() {
        return houseChips;
    }

    public void setHouseChips(int houseChips) {
        this.houseChips = houseChips;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBetNumber() {
        return betNumber;
    }

    public void setBetNumber(int betNumber) {
        this.betNumber = betNumber;
    }
}
