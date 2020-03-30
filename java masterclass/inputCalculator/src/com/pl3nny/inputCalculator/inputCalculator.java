package com.pl3nny.inputCalculator;
import java.lang.Math;
import java.util.Scanner;

public class inputCalculator
{

    public static void inputThenPrintSumAndAverage(){

        Scanner scan = new Scanner(System.in);
        int sum = 0, value;
        int count = 0;

        while(scan.hasNextInt()){
            value = scan.nextInt();
            sum += value;
            count++;
        }

        try{
            System.out.println("SUM = " + sum + " AVG = " + sum/count);
        } catch (Exception e) {
            System.out.println("SUM = " + 0 + " AVG = " + 0);
        }
    }
}
