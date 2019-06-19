package com.company.Arrays;
import java.util.Scanner;

public class Main
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
	// write your code here
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println();
        printArray(sortIntegers(myIntegers));

    }

    public static int[] getIntegers(int number)
    {
        System.out.println("Enter " + number + " integer value.\r");
        int[] values = new int [number];

        for (int i = 0; i < values.length; i++)
        {
            values[i] = scan.nextInt();
        }

        return values;
    }

    // Array printing Function
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Array sorting Function
    public static int[] sortIntegers(int[] arr)
    {
        int[] sortedArray = new int[arr.length];

        //coppies passed array into our new  array
        for (int i = 0; i < sortedArray.length; i++)
        {
            sortedArray[i] = arr[i];
        }
        boolean flag = true;
        int temp;

        while(flag)
        {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++)
            {
                if(sortedArray[i] < sortedArray[i + 1])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
