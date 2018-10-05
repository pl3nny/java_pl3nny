package com.company;

public class Main
{

    public static void main(String[] args)
    {
        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,0);
    }

    public static boolean hasEqualSum(int val1, int val2, int val3)
    {
        if(val1 + val2 == val3)
        {
            System.out.println(val1 + " + (" + val2 + ") = " + val3 + " return true");
            return true;
        }
        else
        {
            System.out.println(val1 + " + (" + val2 + ") != " + val3 + " return false");
            return false;
        }
    }
}
