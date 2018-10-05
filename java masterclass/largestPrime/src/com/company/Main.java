package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Largest Prime: " + getLargestPrime(21));
    }

    public static int getLargestPrime(int number)
    {
        int largestPrime = 0;

        if(number <= 0)
        {
            return -1;
        }
        else
        {
            for(int i = 0; i <= number; i++)
            {
                if(isPrime(i))
                {
                    largestPrime = i;
                }
            }
            return largestPrime;
        }
    }

    public static boolean isPrime(int prime)
    {
        if(prime <= 1)
            return false;
        else
        {
            for(int i = 2; i <= (long)Math.sqrt(prime); i++)
            {
                if(prime % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
