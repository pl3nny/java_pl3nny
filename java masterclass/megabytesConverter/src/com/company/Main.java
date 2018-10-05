package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("\tMegabytes Converter\n");

        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes <= 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + "MB and " +
                    kiloBytes % 1024 + " KB");
        }
    }
}
