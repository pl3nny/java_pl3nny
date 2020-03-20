package com.pl3nny.PayCheckEstimation;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Author: Alexander Hernandez\n");
        System.out.println("\tPay Check Estimation\n");

        int age, hoursWorked, overtime;
        double payRate, dentalSubscription = 0, visionSubscription = 0, medicalSubscription = 0, bonus;
        String name = "name", companyName="employer", medicalInsName = "medical",dentalInsName = "dental", visionIsnName = "vision", answer;

        System.out.print("Employee Name: ");
        name = scan.next();
        System.out.print("Employee Age: ");
        age = scan.nextInt();
        System.out.print("Company Name: ");
        companyName = scan.next();
        System.out.print("Enter current pay rate: $");
        payRate = scan.nextDouble();
        System.out.print("Enter regular hours worked: ");
        hoursWorked = scan.nextInt();
        System.out.print("Enter Over Time hours worked: ");
        overtime = scan.nextInt();
        System.out.print("Enter bonus amount: $");
        bonus = scan.nextDouble();

        System.out.println();
        System.out.print(dentalInsName + " monthly payment: ");
        dentalSubscription = scan.nextDouble();
        System.out.print(visionIsnName + " monthly payment: ");
        visionSubscription = scan.nextDouble();
        System.out.println();

        PayCheck payCheck = new PayCheck(name, age, companyName, payRate, hoursWorked, overtime, bonus,
                medicalSubscription, dentalSubscription, visionSubscription, medicalInsName, dentalInsName,
                visionIsnName);

        System.out.println();
        payCheck.printEmployeeInfo();
        System.out.println();
        payCheck.printBenefits();
        System.out.println();
        payCheck.printCheckInfo();
    }
}
