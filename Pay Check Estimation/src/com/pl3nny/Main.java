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

        System.out.print("Enter current pay rate: $");

        Employee pl3nny = new Employee("Alexander Hernandez",28,"Artech",
                scan.nextDouble(),80,25.99,3.20,"Metlife Dental",
                "VSP");
        FederalTax federalTax = new FederalTax();
        CaliforniaTax californiaTax = new CaliforniaTax();

        PayCheck check = new PayCheck(pl3nny, californiaTax, federalTax);


        int overtime;

        System.out.println("Company Name: " + pl3nny.getCompanyName());
        System.out.println("Employee: " + pl3nny.getName());
        System.out.println("Pay Rate: $" + pl3nny.getHrPayRate());
        System.out.println("Yearly income before Taxes: $" + pl3nny.yearlyIncome());
        System.out.print("Overtime Hours: ");
        overtime = scan.nextInt();
        pl3nny.setOverTimeHours(overtime);
        System.out.println();

        System.out.println("Dental: " + pl3nny.getDentalGroup() + " $" + pl3nny.getBenefitDental());
        System.out.println("Vision: " + pl3nny.getVisionGroup() + " $" + pl3nny.getBenefitVision());
        System.out.println("Benefits Deductions: $" + check.benefitsDeductinos());
        System.out.println();

        System.out.println("Before Taxes: $" + check.checkBeforeTaxes());
        System.out.println("Taxed amount: $" + check.taxedAmount());
        System.out.println("Overtime Pay: $" + check.getOvertimePay());
        System.out.println("Overtime Taxed amount: $" + check.getOTtaxedAmount());
        System.out.println();

        System.out.println("Check After Taxes: $" + check.checkAfterTaxes());
        System.out.println("check after taxes and benefits deductions: $" + (check.checkAfterTaxes() - check.benefitsDeductinos()));

        System.out.println();
    }
}
