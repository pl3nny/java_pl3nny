package com.pl3nny.Roulette;

import java.util.Arrays;
import java.util.Random;

public class Roulette
{
    private int singleZeroWheel[] = {0,32,15,19,4,21,2,25,17,34,6,27,13,36,11,
            30,8,23,10,5,24,16,33,1,20,14,31,9,22,18,29,7,28,12,35,3,26};
    private int doubleZeroWheel[] = {0,28,9,26,30,11,7,20,32,17,5,22,34,15,3,24,
            36,13,1,00,27,10,25,29,12,8,19,31,18,6,21,33,16,4,23,35,14,2};
    private int ball;
    private String color;
    private boolean singleWheel = false;
    private boolean doubleWheel = false;


    public int[] getSingleZeroWheel()
    {
        return singleZeroWheel;
    }

    public int[] getDoubleZeroWheel()
    {
        return doubleZeroWheel;
    }

    public void printSingleZeroWheel()
    {
        System.out.println(Arrays.toString(singleZeroWheel));
        System.out.println();
    }

    public int generateRandomNumber(int length)
    {
        Random rand = new Random();

        return rand.nextInt(length);
    }

    public void printDoubleZeroWheel()
    {
        System.out.println(Arrays.toString(doubleZeroWheel));
        System.out.println();
    }

    public void spinWheel()
    {
        if(singleWheel)
        {
            ball = singleZeroWheel[generateRandomNumber(singleZeroWheel.length)];
            if(ball >= 1 && ball <= 10 || ball >= 19 && ball <= 28)
            {
                if(ball % 2 == 0)
                {
                    color = "black";
                }
                else
                    color = "red";
            }
            else if (ball >= 11 && ball <= 18 || ball >= 29 && ball <= 36)
            {
                if(ball % 2 == 0)
                {
                    color = "red";
                }
                else
                    color = "black";
            }
        }
        else if (doubleWheel)
        {
            ball = doubleZeroWheel[generateRandomNumber(doubleZeroWheel.length)];
        }
    }

    public int getBall()
    {
        return ball;
    }

    public boolean isSingleWheel() {
        return singleWheel;
    }

    public void setSingleWheel(boolean singleWheel) {
        this.singleWheel = singleWheel;
    }

    public boolean isDoubleWheel() {
        return doubleWheel;
    }

    public void setDoubleWheel(boolean doubleWheel) {
        this.doubleWheel = doubleWheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

