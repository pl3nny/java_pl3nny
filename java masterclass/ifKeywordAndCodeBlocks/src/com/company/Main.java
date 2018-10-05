package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }


        // challenge
        System.out.println("\n\tChallenge\n");

        // print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // but make sure the first printout above still dsplay as well.

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
    }
}
