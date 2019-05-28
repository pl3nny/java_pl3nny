package com.inheritanceChallenge;

public class DodgeCharger extends Car
{
    private boolean isScatPack = false;
    private boolean rearWheelDrive = false;
    private boolean allWheelDrive = false;

    public DodgeCharger()
    {
        System.out.println("Loading Dodge Charger...");
        setDoors(4);
    }

    public void setScatPack(boolean isScatPack)
    {
        if(isScatPack)
        {
            setEngine(8);
            this.isScatPack = isScatPack;
            rearWheelDrive = true;
            setSpeed(168);
        }
    }

    public boolean isScatPack(){return isScatPack;}

    public void doBurnOut()
    {
        System.out.println("Alex says...");
        System.out.println("\"Smoke Tires Not Drugs\"...while burning out");
    }

    public void wakeNeighbors()
    {
        if(!isEngineStart())
        {
            setEngineStart(true);
            System.out.println("starting your beast of a car...");
            System.out.println("Now waking up your neighbors");
        }
        else
        {
            System.out.println("Your beast of car is already on fam");
        }
    }

    public boolean isRearWheelDrive(){return rearWheelDrive;}
    public boolean isAllWheelDrive(){return allWheelDrive;}

}
