package com.pl3nny.Roulette;

public class Game
{
    private Roulette roulette;
    private Player[] player;
    private boolean isVip = false;

    public Game(int numOfPlayers)
    {
        player = new Player[numOfPlayers];
        roulette = new Roulette();
    }

    public void createRegPlayer(double cash, int index)
    {
        player[index] = new Player(cash);
    }

    public void createVipPlayer(double cash, int id, String name, int index)
    {
        player[index] = new VipPlayer(cash, id, name);
    }

    public Roulette getRoulette()
    {
        return roulette;
    }
}
