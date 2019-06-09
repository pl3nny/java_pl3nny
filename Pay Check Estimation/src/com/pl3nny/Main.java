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


        double fedWith, medTax, stateDisTax, socialSec, caWith;
        int overtime = 9;
        double taxTotal;
        double deductions = 29.19;

        double overtimePay = (overtime * 1.5) * 25.77;

        fedWith = (double)Math.round((296.70 / 2061.60) * 100.00);
        medTax = (double)Math.round((34.89 / 2061.60) * 100.00);
        stateDisTax = (double)Math.round((24.07 / 2061.60) * 100.00);
        socialSec = (double)Math.round((149.19 / 2061.60) * 100.00);
        caWith = (double)Math.round((109.99 / 2061.60) * 100.00);

        taxTotal = fedWith + medTax + stateDisTax + socialSec + caWith;

        double income = (double)Math.round(80.00 * 25.77 + (25.77* 1.5) * overtime);
        System.out.println("before taxes: $" + income);
        System.out.println("overtime pay: $" + overtimePay);
        System.out.println("Federal Withholding: " + fedWith);
        System.out.println("Medical: " + medTax);
        System.out.println("Social Security: " + socialSec);
        System.out.println("CA withholding: " + caWith);
        System.out.println("CA disability: " + stateDisTax);
        System.out.println("After Taxes: $" + (income - (income *(taxTotal/100.00))));
        System.out.println("After Deductios: $" + (income - deductions - (income * (taxTotal/100.00))));

//        int overtime;
//
//        System.out.println("Company Name: " + pl3nny.getCompanyName());
//        System.out.println("Employee: " + pl3nny.getName());
//        System.out.println("Pay Rate: $" + pl3nny.getHrPayRate());
//        System.out.println();
//
//        System.out.println("Dental: " + pl3nny.getDentalGroup() + " $" + pl3nny.getBenefitDental());
//        System.out.println("Vision: " + pl3nny.getVisionGroup() + " $" + pl3nny.getBenefitVision());
//        System.out.println("Benefits Deductions: $" + check.benefitsDeductinos());
//        System.out.println();
//
//        System.out.print("Enter Overtime hours -> ");
//        overtime = scan.nextInt();
//
//        pl3nny.setOverTimeHours(overtime);
//
//        System.out.println("Worked " + pl3nny.getOverTimeHours() + " hours of overtime");
//        System.out.println("Overtime: $" + check.getOvertimePay());
//        System.out.println("Before Taxes: $" + check.checkBeforeTaxes());
//        System.out.println("After Taxes and Benefits Deductions: $" +
//                check.roundAmount(check.checkAfterTaxes() - check.benefitsDeductinos()));
//
//        System.out.println();
    }
}
