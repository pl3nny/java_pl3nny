package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-1));
    }

    public static int sumFirstAndLastDigit (int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int first = number;
        int last = number % 10;

        while(first / 10 > 0)
        {
            //System.out.println(first);
            first = first / 10;

        }

        return first + last;
    }
}
