package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Even num sum: " + getEvenDigitSum(123456789));
        System.out.println("Even num sum: " + getEvenDigitSum(252));
        System.out.println("Even num sum: " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum (int number)
    {
        int sum = 0;
        int isEven;

        if(number < 0)
        {
            return -1;
        }

        while(number > 0)
        {
            isEven = number % 10;
            if(isEven % 2 == 0)
            {
                System.out.println(isEven);
                sum += isEven;
            }
            number = number / 10;
        }

        return sum;
    }
}
