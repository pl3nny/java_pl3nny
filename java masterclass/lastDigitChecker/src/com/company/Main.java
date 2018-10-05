package com.company;

public class Main
{
    public static void main(String[] args)
    {
        hasSameLastDigit(41,22,71);
        hasSameLastDigit(23,32,42);
        hasSameLastDigit(9,99,999);
    }

    public static boolean hasSameLastDigit (int val1, int val2, int val3)
    {
        if((val1 > 9 && val1 <= 1000) && (val2 > 9 && val2 <= 1000) && (val2 > 9 && val2 <= 1000))
        {
            int first = val1 % 10;
            int second = val2 % 10;
            int third = val3 % 10;

            if(first == second || first == third || second == third)
            {
                System.out.println("true");
                return true;
            }
            else
            {
                System.out.println("false");
                return false;
            }
        }

        System.out.println("One or more values not in range");
        return false;
    }
}
