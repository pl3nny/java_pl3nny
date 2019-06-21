package com.pl3nny.PayCheckEstimation;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Author: Alexander Hernandez\n");
        System.out.println("\tPay Check Estimation\n");

        int age;
        double overtime, hoursWorked, payRate, dentalSubscription = 25.99, visionSubscription = 3.20, medicalSubscription = 0;
        String name, companyName = "", medicalInsName = "N/A",dentalInsName = "MedLife", visionIsnName = "VSP", answer;

        System.out.print("Employee Name: ");
        name = scan.next();
        System.out.print("Employee Age: ");
        age = scan.nextInt();
        System.out.print("Company Name: ");
        companyName = scan.next();
        System.out.print("Enter current pay rate: $");
        payRate = scan.nextDouble();
        System.out.print("Enter hours regular hours worked: ");
        hoursWorked = scan.nextDouble();
        System.out.print("Enter Over Time hours worked: ");
        overtime = scan.nextDouble();
        System.out.println();

//        System.out.print("Are you currently insured with with Medical, dental, or vision? (y or yes): ");
//        answer = scan.next();
//        if(answer.equals("y") || answer.equals("yes"))
//        {
//            System.out.println("type \"N/A\" if not applicable... ");
//            System.out.print("Medical Insurer: ");
//            medicalInsName = scan.next();
//            System.out.print(medicalInsName + " monthly payment: ");
//            medicalSubscription = scan.nextDouble();
//            System.out.print("Dental Insurer: ");
//            dentalInsName = scan.next();
//            System.out.print(dentalInsName + " monthly payment: ");
//            dentalSubscription = scan.nextDouble();
//            System.out.print("Vision Insurer: ");
//            visionIsnName = scan.next();
//            System.out.print(visionIsnName + " monthly payment: ");
//            visionSubscription = scan.nextDouble();
//        }
        System.out.println();

        Employee employee = new Employee(name,age,companyName, payRate,hoursWorked,
                dentalSubscription,visionSubscription,dentalInsName,visionIsnName);
        FederalTax federalTax = new FederalTax();
        CaliforniaTax californiaTax = new CaliforniaTax();
        PayCheck check = new PayCheck(employee, californiaTax, federalTax);

        System.out.println("Company Name: " + employee.getCompanyName());
        System.out.println("Employee: " + employee.getName());
        System.out.println("Pay Rate: $" + employee.getHrPayRate());
        System.out.println("Yearly income before Taxes: $" + employee.yearlyIncome());
        employee.setOverTimeHours(overtime);
        System.out.println();

        System.out.println("Dental: " + employee.getDentalGroup() + " $" + employee.getBenefitDental());
        System.out.println("Vision: " + employee.getVisionGroup() + " $" + employee.getBenefitVision());
        System.out.println("Benefits Deductions: $" + check.benefitsDeductinos());
        System.out.println();

        System.out.println("Before Taxes: $" + check.checkBeforeTaxes());
        System.out.println("Taxed amount: $" + check.taxedAmount());

        if(employee.isWorkedOvertime())
        {
            System.out.println("Overtime Pay: $" + check.getOvertimePay());
            System.out.println("Overtime Taxed amount: $" + check.getOTtaxedAmount());
        }

        System.out.println();

        System.out.println("Check After Taxes: $" + check.checkAfterTaxes());
        System.out.println("check after taxes and benefits deductions: $" + (check.checkAfterTaxes() - check.benefitsDeductinos()));

        System.out.println();
    }
}
