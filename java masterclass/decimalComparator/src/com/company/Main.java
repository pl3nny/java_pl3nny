package com.company;

public class Main
{

    public static void main(String[] args)
    {
        areEqualByThreeDecimalPlaces(1.324, 1.3246);
    }

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2)
    {
        if(val1 == val2)
        {
            System.out.println(val1 + " and " + val2 + " are equal.");
            return true;
        }
        else if (val1 > val2)
        {

        }
        else if(val2 > val1)
        {

        }

        return false;
    }
}
