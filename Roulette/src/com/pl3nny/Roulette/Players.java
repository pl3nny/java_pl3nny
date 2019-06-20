package com.pl3nny.Roulette;

public class Players
{
    private Player player;
    private Vip vipPlayer;
    private boolean isVip = false;

    public Players(int cash)
    {
        player = new Player(cash);
    }

    public Players(int cash, int id, String name)
    {
        setVip(true);
        vipPlayer = new Vip(cash, id, name);
    }

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public Vip getVipPlayer()
    {
        return vipPlayer;
    }

    public void setVipPlayer(Vip vipPlayer)
    {
        this.vipPlayer = vipPlayer;
    }

    public boolean isVip()
    {
        return isVip;
    }

    public void setVip(boolean vip)
    {
        this.isVip = vip;
    }
}
