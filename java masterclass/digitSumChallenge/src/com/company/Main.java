package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("sum of digits is: " + sumDigits(125));
        System.out.println("sum of digits is: " + sumDigits(1025));
        System.out.println("sum of digits is: " + sumDigits(0));
        System.out.println("sum of digits is: " + sumDigits(-1));
        System.out.println("sum of digits is: " + sumDigits(32123));
    }

    public static int sumDigits(int number)
    {
        int sum = 0;
        if(number >= 10)
        {
            while(number > 0)
            {
                sum += number % 10; // extracts the least-significant digit i.e. 125 % 10 = 5;
                number = number / 10; // discards the least-significant digit i.e. 125 / 10 = 12;
            }
        }
        else if( number < 10)
        {
            return -1;
        }
        return sum;
    }
}
