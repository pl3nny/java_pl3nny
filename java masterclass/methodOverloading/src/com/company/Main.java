package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("12ft and 60 inches in centimeters: " +
                calcFeetAndInchesToCentimeters(12, 60) + " centimeters");
        System.out.println("12ft and 5 inches in centimeters: " +
                calcFeetAndInchesToCentimeters(12, 5) + " centimeters");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        double centi = 30.48;
        if(feet >= 0 && inches >= 0 && inches <= 12)
        {
            return centi * feet  + centi * (calcFeetAndInchesToCentimeters(inches));
        }
        else if(inches > 12)
        {
            return calcFeetAndInchesToCentimeters
                    ((calcFeetAndInchesToCentimeters(inches) + feet), 0);
        }

        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches >= 0)
        {
            // calculate how many feet in inches
            return inches / 12;
        }
        return -1;
    }
}
