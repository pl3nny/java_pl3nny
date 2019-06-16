package com.pl3nny.MonthlyExpense;
import com.pl3nny.DebtPaymentEstimation.*;
import com.pl3nny.PayCheckEstimation.*;

public class MyFinances
{
    private PayCheck check = new PayCheck();
    private Debt debt = new Debt();
    private double netflix = 12.99, gymMembership = 14.99, spotify = 4.99;
    private double debtPayment = 500, barclay = 100, carInsurence = 100, rent = 1000;

    public MyFinances()
    {
        check.getEmployee().setHrPayRate(29.44);
        check.getEmployee().setHoursWorked(160);
        check.getEmployee().setBenefitDental(25.99 * 2);
        check.getEmployee().setBenefitVision(3.20 * 2);
    }

    public void financialStatement()
    {
        System.out.println("Current hourly pay rate: $" + check.getEmployee().getHrPayRate());
        System.out.println("Yearly income before taxes: $" + check.getEmployee().yearlyIncome());
        System.out.println("Monthly income before taxes: $" + check.checkBeforeTaxes());
        System.out.println("Monthly income taxed amount: $" + check.taxedAmount());
        System.out.println("Benefit deduction amount: $" + check.benefitsDeductinos());
        System.out.println("Monthly income after taxes: $" + check.checkAfterTaxes());
        System.out.println("Monthly income after taxes and benefit deductions: $" +
                (check.checkAfterTaxes() - check.benefitsDeductinos()));
        System.out.println("Monthly bills and rent payments: $" + sumOfBills());
        System.out.println("Left over income after taxes, benefit deductions, and bills: $" + monthlyIncomeAfterTaxes_DeductionsAndBills());
    }

    public double sumOfBills()
    {
        return (netflix + gymMembership + spotify + debtPayment + barclay + carInsurence + rent);
    }

    public double  monthlyIncomeAfterTaxes_DeductionsAndBills()
    {
        return (check.checkAfterTaxes() - check.benefitsDeductinos() - sumOfBills());
    }
}
