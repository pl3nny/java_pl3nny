package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int switchValue = 6;

        switch(switchValue)
        {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value was a 3, 4, or 5");
                break;
            default:
                System.out.println("was not 1, 2, 3, 4, or 5");
                break;
        }

        char selection = 'F';

        switch(selection)
        {
            case 'A':
                System.out.println("A was use");
                break;
            case 'B':
                System.out.println("B was use");
                break;
            case 'C':
                System.out.println("C was use");
                break;
            case 'D':
                System.out.println("D was use");
                break;
            case 'E':
                System.out.println("E was use");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
