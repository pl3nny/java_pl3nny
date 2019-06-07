package com.pl3nny;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Author: Alexander Hernandez\n");
        System.out.println("\tPay Check Estimation\n");

        Employee pl3nny = new Employee("Alexander Hernandez",28,"Artech",
                25.77,80,25.99,3.20,"Metlife Dental",
                "VSP");

        CaliforniaTax caTax = new CaliforniaTax(1.0,3.89);
        FederalTax fedTax = new FederalTax(10.99,6.2,1.45);

        PayCheck check = new PayCheck(pl3nny, caTax, fedTax);

        int overtime;

        System.out.println("Company Name: " + pl3nny.getCompanyName());
        System.out.println("Employee: " + pl3nny.getName());
        System.out.println("Pay Rate: $" + pl3nny.getHrPayRate());
        System.out.println();

        System.out.println("Dental: " + pl3nny.getDentalGroup() + " $" + pl3nny.getBenefitDental());
        System.out.println("Vision: " + pl3nny.getVisionGroup() + " $" + pl3nny.getBenefitVision());
        System.out.println("Benefits Deductions: $" + check.benefitsDeductinos());
        System.out.println();

        System.out.print("Enter Overtime hours -> ");
        overtime = scan.nextInt();

        pl3nny.setOverTimeHours(overtime);

        System.out.println("Worked " + pl3nny.getOverTimeHours() + " hours of overtime");
        System.out.println("Overtime: $" + check.getOvertimePay());
        System.out.println("Before Taxes: $" + check.checkBeforeTaxes());
        System.out.println("After Taxes and Benefits Deductions: $" +
                check.roundAmount(check.checkAfterTaxes() - check.benefitsDeductinos()));

        System.out.println();
    }
}
