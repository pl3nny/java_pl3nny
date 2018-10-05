package com.company;

public class Main
{
    public static void main(String[] args)
    {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number)
    {
        if(number < 1)
        {
            System.out.println("invalid value");
        }
        else
        {
            int factor = number;
            while(factor > 0)
            {
                if(number % factor ==0)
                {
                    System.out.print(factor + " ");
                }
                factor--;
            }
            System.out.println();
        }
    }
}
