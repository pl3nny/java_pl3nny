package com.pl3nny;

/**
 * # Let's Build a Vendor Availability system
 *
 * ## Problem
 *
 * We need to know if a vendor (restaurant) is available to deliver a meal.
 *
 * So given a list of upcoming meals, build a function that will tell us if
 *
 * the vendor (restaurant) is available to take the order.
 *
 * ## Requirements
 *
 * - input: take a vendor_id and a date
 *
 * - output: True if the vendor is available, False if not
 *
 * - A vendor is available if:
 *
 *   - They have enough drivers for a concurrent delivery
 *
 *   - As long as the delivery blackout period doesn't overlap (30 minutes before, 10 minutes after)
 */

import java.util.Date;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println();
        System.out.println("\tZero Cater\n");

        Date[] dateList = new Date[3];
        Vendor[] vendor = new Vendor[2];

        dateList[0] = new Date(117, 0, 1, 13, 30, 0);
        dateList[1] = new Date(117, 0,1,14,30,0);
        dateList[2] = new Date(117,0,1,13,30,0);

        vendor[0] = new Vendor(1, 1, 2);
        vendor[1] = new Vendor(2, 3,1);

        //set client_ids
        vendor[0].setClient_id(0, 10);
        vendor[0].setClient_id(1, 40);
        vendor[1].setClient_id(0, 20);

        // set dates for vendors
        for (int i = 0; i < 1; i++) {
            vendor[0].setDate(i,dateList[i]);
        }
        vendor[1].setDate(0,dateList[2]);

        //set drivers per vendor
        vendor[0].setDrivers(1);
        vendor[1].setDrivers(3);

        //******************************************************

        System.out.println("\t" +vendor[0].printVendorID() + "\t" + vendor[0].printDrivers());

        for(int i = 0; i < 2; i++){
            System.out.println(vendor[0].printVendorID());
            System.out.println(vendor[0].printClientID(i));
            System.out.println(vendor[0].printDate(i));
            System.out.println();
        }

        System.out.println("\t" + vendor[1].printVendorID() + "\t" + vendor[1].printDrivers());
        System.out.println(vendor[1].printVendorID());
        System.out.println(vendor[1].printClientID(0));
        System.out.println(vendor[1].printDate(0));
        System.out.println();


        System.out.println("is vendor " + vendor[0].getId() + " available at " + dateList[0] + " - " +
                vendor[0].is_Vendor_Available(vendor[0].getId(),dateList[0]));
        System.out.println("Drivers available: " + vendor[0].getDrivers());


        System.out.println("is vendor " + vendor[0].getId() + " available at " + new Date(117, 0, 2,14,30,0) + " - " +
                vendor[0].is_Vendor_Available(vendor[0].getId(),dateList[1]));

        System.out.println("Drivers available: " + vendor[0].getDrivers());


    }

}
