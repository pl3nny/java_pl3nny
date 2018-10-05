package com.company;

public class Main
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 10_000; i++)
        {
            if(isPerfectNumber(i))
            {
                System.out.println(i + " is a perfect number");
            }
        }
    }

    public static boolean isPerfectNumber (int number)
    {
        if(number > 0)
        {
            int perfectNum = 0;
            int temp = number - 1;
            while(temp > 0)
            {
                if(number % temp == 0)
                {
                    perfectNum += temp;
                }
                temp--;
            }
            //System.out.println(perfectNum);

            if(perfectNum == number)
            {
                return true;
            }
        }
        return false;
    }
}
