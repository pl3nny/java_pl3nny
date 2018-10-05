package com.company;

public class Main
{

    public static void main(String[] args)
    {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }

    public static boolean isLeapYear(int year)
    {
        if(year >= 1 && year <= 9999)
        {
            if(year % 4 == 0 && year % 100 == 0)
            {
                System.out.println(year + " is a leap year");
                return true;
            }
            else
            {
                System.out.println(year + " is not a leap year");
                return false;
            }
        }
        else
        {
            System.out.println("not in range...");
            return false;
        }
    }
}
