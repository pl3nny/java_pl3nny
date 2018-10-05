package com.company;

public class Main
{

    public static void main(String[] args)
    {
        bark(true, 1);
        bark(false, 2);
        bark(true, 8);
        bark(true, -1);
    }



    /*
    Wrtie a method bark that has two parameters
    1st type boolean named barking
    2nd type int named hourOfDay
    wake up if dog barking is true and hourOfDay 0 - 23 inclusive
     */

    public static boolean bark (boolean barking, int hourOfDay)
    {
        if(barking == true && hourOfDay >= 0 && hourOfDay < 23)
        {
            System.out.println("wakeup");
            return true;
        }
        else
        {
            System.out.println("sleep");
            return false;
        }
    }
}
