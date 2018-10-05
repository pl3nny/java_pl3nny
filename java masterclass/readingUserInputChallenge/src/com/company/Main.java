package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int input = 0;

        boolean hasNextInt;

        while(count < 10)
        {
            System.out.print("Enter a number #" + (count + 1) + ": ");

            hasNextInt = scan.hasNextInt();

            if(hasNextInt)
            {
                input = scan.nextInt();
                sum += input;
                count++;
            }
            else
            {
                System.out.println("invalid number");
            }

            scan.nextLine(); // handle end of line (enter key) to avoid infinite loop

        }

        System.out.println("the sum of all the values: " + sum);
        scan.close();
    }
}
