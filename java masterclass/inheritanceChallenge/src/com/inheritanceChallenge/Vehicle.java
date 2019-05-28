package com.inheritanceChallenge;

public class Vehicle
{
    private boolean engineStart = false;
    private int engine;
    private int speed;

    public void setEngineStart(boolean engineStart){this.engineStart = engineStart;}
    public boolean isEngineStart(){return engineStart;}
    public void setEngine(int engine){this.engine = engine;}
    public int getEngine(){return engine;}
    public void setSpeed(int speed){this.speed = speed;}
    public int getSpeed(){return speed;}
}
