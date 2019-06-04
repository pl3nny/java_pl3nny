package com.inheritanceChallenge;

public class Car extends Vehicle
{
    private int doors;
    private int wheels;
    private int valves;
    private int speed;
    private boolean isStopped = true;
    private boolean isMoving = false;

    public Car(String name, String color, int door, int valves)
    {
        super(name, color);
        this.doors = doors;
        this.wheels = 4;
        this.valves = valves;
        this.speed = 0;
    }

    public void stop()
    {
        speed = 0;
        isStopped = true;
        isMoving = false;
    }

    public boolean isStopped(){return isStopped;}
    public boolean isMoving(){return isMoving;}

}
