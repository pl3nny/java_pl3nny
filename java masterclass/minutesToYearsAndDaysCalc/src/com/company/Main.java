package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printYearsAndDAys(525600);
        printYearsAndDAys(1051200);
        printYearsAndDAys(561600);
        printYearsAndDAys(563489);
    }

    public static void printYearsAndDAys(long minutes)
    {
        if(minutes < 0)
        {
            System.out.println("invalid value");
        }
        else
        {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;

            long remainingMinutes = minutes % 60;
            long remainingHours = hours % 24;
            long remainingDays = days % 365;

            System.out.println(years + "yrs " + (remainingDays) + "ds " + remainingHours + "hrs " + remainingMinutes + "ms");
        }

    }
}
