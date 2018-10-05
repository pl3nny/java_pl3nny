package com.company;

public class Main
{

    public static void main(String[] args)
    {
        for(int i = 1; i < 50; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean isPrime(int num)
    {
        if(num == 1)
            return false;
        if(num == 2)
            return true;

        for(int i = 2; i <= (long) Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
