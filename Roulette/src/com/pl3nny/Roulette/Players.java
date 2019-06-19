package com.pl3nny.Roulette;

public class Players extends Player
{
    private Player player;
    private Vip vipPlayer;
    private boolean isVip = false;

    public Players(int cash)
    {
        super(cash);
    }

    public Players(int cash, int id, String name)
    {
        super(cash);
        this.vipPlayer.setId(id);
        this.vipPlayer.setName(name);
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
        isVip = vip;
    }
}
