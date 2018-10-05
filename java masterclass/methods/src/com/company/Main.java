package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        System.out.println("\n\tChallenge\n");

        String name = "Kobe";

        score = 1500;
        displayHighScorePosition(name, calculateHighScorePosition(score));
        score = 900;
        displayHighScorePosition(name, calculateHighScorePosition(score));
        score = 400;
        displayHighScorePosition(name, calculateHighScorePosition(score));
        score = 50;
        displayHighScorePosition(name, calculateHighScorePosition(score));
    }

    public static void displayHighScorePosition(String name, int scorePos)
    {
        System.out.println(name + " managed to get into position " + scorePos + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        if(playerScore >= 1000)
            return 1;
        else if (playerScore >= 500)
            return 2;
        else if (playerScore >= 100)
            return 3;

        return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int lvComp, int bonus)
    {

        if(gameOver)
        {
            int finalScore = score + (lvComp * bonus);
            finalScore += 1000;

            return finalScore;
        }

        return -1;
    }
}
