package com.inheritanceChallenge;

public class Main
{

    public static void main(String[] args)
    {
        /*
        * Challenge
        * Start with a base class of a vehicle, then create a Car class tht inherits from this base class
        * Finally, create another class, a specific type of Car that inherits from the Car class.
        * You should be able to hand steer, change gears, move(speed)
        * You will want to decide where to put the appropriate state and behaviours (fields and methods)
        * As mentioned above, changing gears, increasing/decreasing speed should be included
        * For you specific type of vehicle you want to add something specific for that ype of car
        */

        DodgeCharger alexScatPack = new DodgeCharger();

        alexScatPack.setScatPack(true);
        System.out.println();
        System.out.println("engine: 6.4L Hemi v" + alexScatPack.getEngine());
        System.out.println("top speed: " + alexScatPack.getSpeed() + " MPH");
        //alexScatPack.setEngineStart(true);
        alexScatPack.wakeNeighbors();
        alexScatPack.doBurnOut();
    }
}
