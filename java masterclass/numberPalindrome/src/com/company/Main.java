package com.company;

public class Main
{
    public static void main(String[] args)
    {
        isPalindrome(1221);
    }

    public static boolean isPalindrome (int number)
    {
        int reverse = 0;
        int isPalin = number;

        while(isPalin > 0)
        {
            reverse = (reverse * 10) + (isPalin % 10);
            isPalin = isPalin / 10;
        }

        System.out.println("original value: " + number);
        System.out.println("potential palindrome: " + reverse);

        if(number == reverse)
        {
            System.out.println(number + " is a palindrome");
            return true;
        }
        return false;
    }
}
