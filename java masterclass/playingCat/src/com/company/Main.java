package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\tPlaying Cat\n");
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
    }

    public static boolean isCatPlaying (boolean summer, int temperature)
    {
        if(summer == false && temperature >= 25 && temperature <= 35)
        {
            System.out.println("cat is playing");
            return true;
        }
        else if (summer == true && temperature >= 25 && temperature <= 45)
        {
            System.out.println("cat is playing");
            return true;
        }
        System.out.println("cat is NOT playing");
        return false;
    }
}
