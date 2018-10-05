package com.company;

public class Main
{
    // failed
    public static void main(String[] args)
    {
        printSquareStar(5);
    }

    public static void printSquareStar(int number)
    {
        int row = number;
        int col = number;
        int rowCount = 0;
        if(number < 5)
            System.out.println("invalid value");
        else
        {
            for(int i = 1; i <= col; i++)
            {
                for(int j = 1; j <= row; j++)
                {
                    if(i == 1 || i == col)
                    {
                        System.out.print("*");
                    }
                    else if(j == 1 || j == row)
                    {
                        System.out.print("*");
                    }
                    else if(i == j)
                    {
                        System.out.print("*");
                    }
                    else if(j == (rowCount - (i + 1)))
                    {
                        System.out.print("*");
                    }
                    rowCount++;
                }
                System.out.println();

            }
        }
    }
}
