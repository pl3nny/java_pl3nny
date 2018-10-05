package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(summOdd(1, 100));
        System.out.println(summOdd(-1, 100));
        System.out.println(summOdd(100, 100));
        System.out.println(summOdd(100, -100));
        System.out.println(summOdd(100, 1000));
    }

    public static boolean isOdd(int number)
    {
        if(number % 2 == 0 && number > 0)
        {
            return false;
        }
        return true;
    }

    public static int summOdd(int start, int end)
    {
        int sum = 0;

        if(start > 0  && end > 0)
        {
            for (int i = start; i <= end; i++)
            {
                if (isOdd(i))
                {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
