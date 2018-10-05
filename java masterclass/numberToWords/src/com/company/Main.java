package com.company;

public class Main
{
    public static void main(String[] args)
    {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(100);
        numberToWords(100000);
    }

    public static void numberToWords (int number)
    {
        if(number < 0)
        {
            System.out.println("invalid value");
        }
        else
        {
            int selection;
            int ogNumber = number;
            int digCount = getDigitCount(number);
            number = reverse(number);
            while(number > 0)
            {
                selection = number % 10;
                switch(selection)
                {
                    case 1:
                        System.out.print("ONE");
                        break;
                    case 2:
                        System.out.print("TWO");
                        break;
                    case 3:
                        System.out.print("THREE");
                        break;
                    case 4:
                        System.out.print("FOUR");
                        break;
                    case 5:
                        System.out.print("FIVE");
                        break;
                    case 6:
                        System.out.print("SIX");
                        break;
                    case 7:
                        System.out.print("SEVEN");
                        break;
                    case 8:
                        System.out.print("EIGHT");
                        break;
                    case 9:
                        System.out.print("NINE");
                        break;
                    case 0:
                        System.out.print("ZERO");
                        break;
                }
                System.out.print(" ");
                number /= 10;
                digCount--;
            }
            for(int i = 0; i < digCount; i++)
            {
                System.out.print("ZERO ");
            }
        }
        System.out.println();
    }

    public static int reverse(int val)
    {
        int rev = 0;
        if( val < 0)
        {
            return -1;
        }

        while(val > 0)
        {
            rev = (rev * 10) + val % 10;
            val /= 10;
        }

        return rev;
    }

    public static int getDigitCount(int digit)
    {
        int count = 0;
        if(digit < 0)
        {
            return -1;
        }

        while(digit > 0)
        {
            count++;
            digit /= 10;
        }

        return count;
    }
}
