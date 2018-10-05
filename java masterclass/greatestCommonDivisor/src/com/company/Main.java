package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor (int first, int second)
    {
        int gcd, small, large;

        if(first < 10 || second < 10)
        {
            return -1;
        }

        if(first > second)
        {
            gcd = second;
            small = second;
            large = first;
        }
        else
        {
            gcd = first;
            small = first;
            large = second;
        }

        while(gcd > 0)
        {
            if(large % gcd == 0 && small % gcd == 0)
                return gcd;
            else
                gcd--;
        }

        return gcd;
    }
}
