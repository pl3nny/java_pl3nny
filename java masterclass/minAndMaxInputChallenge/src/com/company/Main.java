package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        boolean isNextInt = true;
        boolean first = true;
        int input;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter number: ");
            isNextInt = scan.hasNextInt();
            if(isNextInt)
            {
                input = scan.nextInt();

                if(first)
                {
                    first = false;
                    min = input;
                    max = input;
                }

                if (input < min)
                {
                    min = input;
                }
                else if (input > max)
                {
                    max = input;
                }
            }
            else
            {
                System.out.println("invalid input");
                break;
            }
            scan.nextLine();
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
