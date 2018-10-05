package com.company;

public class Main
{
    public static void main(String[] args)
    {
        hasSharedDigit(12,23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15,55);
        hasSharedDigit(51,55);
    }

    public static boolean hasSharedDigit (int val1, int val2)
    {
        if((val1 > 9 && val1 < 100) && (val2 > 9 && val2 < 100))
        {
            int temp = val2;
            int checkNum;
            while(val1 > 0)
            {
                checkNum = val1 % 10;
                while(val2 > 0)
                {
                    if(checkNum == val2)
                    {
                        System.out.println(checkNum + " appears in " + temp);
                        return true;
                    }
                    val2 /= 10;
                }
                val1 /= 10;
                val2 = temp;
            }
        }
        System.out.println("one or both values are not in range");
        return false;
    }
}
