package com.inheritanceChallenge;

public class Car extends Vehicle
{
    private int doors;
    private int wheels = 4;
    private String color;

    public void setDoors(int doors){this.doors = doors;}
    public int getDoors(){return doors;}
    public int getWheels(){return wheels;}
    public void setColor(String color){this.color = color;}
    public String getColor(){return color;}
}
