package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("\tNumber Of Days In Month\n");
        getDaysInMonth(2, 2020);
    }

    public static int getDaysInMonth(int month, int year)
    {
        // april, june, sept, & nov have 30 days other months have 31
        // except feb = 28 expcept on leap year which feb = 29
        if(month > 0 || month <= 12 || year > 0 || year <= 9999)
        {
            int jan = 31, feb = 28, march = 31, april = 30, may = 31, june = 30,
                    july = 31, aug = 31, sept = 30, oct = 31, nov = 30, dec = 31;
            if (isLeapYear(year))
            {
                feb = 29;
            }
            switch(month)
            {
                case 1:
                    System.out.println(jan + " days");
                    break;
                case 2:
                    System.out.println(feb + " days");
                    break;
                case 3:
                    System.out.println(march + " days");
                    break;
                case 4:
                    System.out.println(april + " days");
                    break;
                case 5:
                    System.out.println(may + " days");
                    break;
                case 6:
                    System.out.println(june + " days");
                    break;
                case 7:
                    System.out.println(july + " days");
                    break;
                case 8:
                    System.out.println(aug + " days");
                    break;
                case 9:
                    System.out.println(sept + " days");
                    break;
                case 10:
                    System.out.println(oct + " days");
                    break;
                case 11:
                    System.out.println(nov + " days");
                    break;
                case 12:
                    System.out.println(dec + " days");
                    break;
                default:
                    System.out.println("invalid month");
                    break;
            }
        }
        return -1;
    }

    public static boolean isLeapYear(int year)
    {
        if(year >= 0 || year <= 9999)
        {
            if (year % 4 == 0 && year % 100 != 0)
            {
                return true;
            }
            return false;
        }
        return false;
    }
}
