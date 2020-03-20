package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main
{

    public static void main(String[] args)
    {
        String users[] = {"user1", "user2", "user1", "user3", "user4", "user2", "user4"};
        double ram[] = {30.1, 20, 35.5, 15.7, 45.7, 60.6, 100.15};

        Job jobs [] = new Job [users.length];

        HashMap<String, Double> map = new HashMap<String, Double>();


        for(int i  = 0; i < jobs.length; i++)

        {
            jobs[i] = new Job();
            jobs[i].setUser(users[i]);
            jobs[i].setRam(ram[i]);

            if(map.containsKey(jobs[i].getUser()) && map.get(jobs[i].getUser()) < jobs[i].getRam())
            {
                map.remove(jobs[i].getUser());
                map.put(jobs[i].getUser(), jobs[i].getRam());
            }
            else
            {
                map.put(jobs[i].getUser(), jobs[i].getRam());
            }
        }

        // output user and max ram

        System.out.println();
        System.out.println(Arrays.toString(users));
        System.out.println(Arrays.toString(ram));
        System.out.println("users Peak RAM usage: " + map);
    }
}
