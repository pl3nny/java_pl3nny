package com.inheritanceChallenge;

public class DodgeCharger extends Car
{
    private boolean engineStart = false;
    private boolean isScatPack = false;
    private boolean rearWheelDrive = false;
    private boolean allWheelDrive = false;

    public DodgeCharger(String color, int valves, boolean isScatPack)
    {
        super("Charger", color, 4, valves);
        System.out.println("Loading Dodge Charger...");

        if (isScatPack)
        {
            rearWheelDrive = true;
            setName("Dodge Charger Scat Pack");
        }
    }

    public void startEngine(boolean engineStart)
    {
        this.engineStart = engineStart;
    }

    public boolean isEngineStart()
    {
        return engineStart;
    }

    public boolean isScatPack()
    {
        return isScatPack;
    }

    public boolean isRearWheelDrive()
    {
        return rearWheelDrive;
    }

    public boolean isAllWheelDrive()
    {
        return allWheelDrive;
    }

    public void doBurnout()
    {
        if(isEngineStart())
        {
            System.out.println("Alex's says \"Smoke Tires Not Drugs\" while burning out");
        }
        else
        {
            System.out.println("starting engine and waking up neighbors");
            startEngine(true);
            doBurnout();
        }
    }
}
