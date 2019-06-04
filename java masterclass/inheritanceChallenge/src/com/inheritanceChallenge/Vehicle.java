package com.inheritanceChallenge;

public class Vehicle
{
    private String name;
    private String color;

    public Vehicle(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public void setName(String name){this.name = name;}
    public void setColor(String color){this.color = color;}
    public String getName(){return name;}
    public String getColor(){return color;}
}
