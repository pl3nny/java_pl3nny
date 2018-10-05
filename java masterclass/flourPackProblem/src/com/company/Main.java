package com.company;

public class Main
{
    public static void main(String[] args)
    {
        canPack(1,0,4);
        canPack(1,0,5);
        canPack(0,5,4);
        canPack(2,2,12);
        canPack(-3,2,12);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        int kilos = (bigCount * 5) + smallCount;
        if((bigCount* 5) <= goal && kilos >= goal)
        {
            System.out.println("can pack");
            return true;
        }
        System.out.println("cannot pack");
        return false;
    }

}
