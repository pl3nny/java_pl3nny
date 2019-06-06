package com.pl3nny;

public class PayCheck
{
    private Employee employee;
    private CaliforniaTax californiaTax;
    private FederalTax federalTax;
    private double beforeTax;
    private double afterTax;
    private double taxedAmount;
    private double benefitsDeductions;

    public PayCheck(Employee employee, CaliforniaTax californiaTax, FederalTax federalTax)
    {
        this.employee = employee;
        this.californiaTax = californiaTax;
        this.federalTax = federalTax;
    }

    private double sumOfTax()
    {
        return californiaTax.getStateIncome() + californiaTax.getStateDisabilityTax()
                + federalTax.getSocialSecurity() + federalTax.getMedicare() + federalTax.getFedIncome();
    }

    public double taxedAmount()
    {
        taxedAmount = (checkBeforeTaxes() - benefitsDeductinos()) * sumOfTax();
        return roundAmount(taxedAmount);
    }

    public double benefitsDeductinos()
    {
        this.benefitsDeductions = employee.getBenefitDental() + employee.getBenefitVision();
        return roundAmount(this.benefitsDeductions);
    }

    public double checkBeforeTaxes()
    {
        beforeTax = employee.getHrPayRate() * employee.getHoursWorked();

        return roundAmount(beforeTax);
    }

    public double checkAfterTaxes()
    {
        afterTax = beforeTax - taxedAmount();

        return afterTax;
    }

    public double roundAmount(double amount)
    {
        return (double)Math.round(amount * 100) / 100;
    }
}
