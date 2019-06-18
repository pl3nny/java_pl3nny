package com.company.polymorphism;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

class Movie
{
    private String name;
    public Movie(String name)
    {
        this.name = name;
    }

    public String plot()
    {
        return "no plot here";
    }

    public String getName()
    {
        return name;
    }
}

class Jaws extends Movie
{
    public Jaws()
    {
        super("Jaws");
    }

    @Override
    public String plot()
    {
        return "A shark eats lots of people";
    }
}

class IndependeceDay extends Movie
{
    public IndependeceDay()
    {
        super("Independence Day");
    }

    @Override
    public String plot()
    {
        return "Aliens try and take over planet Earth";
    }
}

class Mazerunner extends Movie
{
    public Mazerunner()
    {
        super("Maze Runner");
    }

    @Override
    public String plot()
    {
        return "kids try and escape a maze";
    }
}

class StarWars extends Movie
{
    public StarWars()
    {
        super("StarWars");
    }

    @Override
    public String plot()
    {
        return "Emperial forces try and take over the Galaxy";
    }
}

class Forgetable extends Movie
{
    public Forgetable()
    {
        super("Forgetable");
    }
}

public class Main
{
    public static void main(String[] args)
    {
	// write your code here
        for (int i = 1; i <= 10; i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    // returns one of the 5 random movies from the classes
    public static Movie randomMovie()
    {
        // generates a random number from 1 - 5
        int randomNumber = (int)(Math.random() * 5 ) + 1;

        System.out.println("Random number generated: " + randomNumber);

        switch (randomNumber)
        {
            case 1:
                return new Jaws();
            case 2:
                return new IndependeceDay();
            case 3:
                return new Mazerunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
