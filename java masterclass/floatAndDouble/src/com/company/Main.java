package com.company;

public class Main
{

    public static void main(String[] args)
    {


        int myIntValue = 5;                         // width of int = 32 ( 4 bytes )
        float myFloatValue = 5f;                    // width of float = 32 ( 4 bytes )
        double myDoubleValue = 5d;                  // width of double = 64 ( 8 bytes )

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        System.out.println();
        System.out.println("Checking precision...");

        //no remainder of ints
        System.out.println("myIntValue = " + myIntValue / 3);

        //precision of float only has 7 decimal points
        System.out.println("myFloatValue = " + myFloatValue / 3f);

        //precision of double has 16 decimal points
        System.out.println("myDoubleValue = " + myDoubleValue / 3d);



        // challenge
        // Convert given number of pounds to kilograms
        // 1. Create a variable to store a number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable.
        // 3. Print out the result.

        // NOTES: 1 pound is equal to 0.45359237 kilograms


        System.out.println();
        System.out.println("\tConvert pounds to kilograms\n");

        double pounds = 5d;
        double kilo = 0.45359237d;

        System.out.println(pounds + " pounds is equal to " + pounds * kilo + " kilograms. ");
    }
}
