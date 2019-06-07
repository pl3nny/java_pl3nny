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
    private double overtimePay;

    public PayCheck(Employee employee, CaliforniaTax californiaTax, FederalTax federalTax)
    {
        this.employee = employee;
        this.californiaTax = californiaTax;
        this.federalTax = federalTax;
        this.overtimePay = 0;
    }

    private double sumOfTax()
    {
        return californiaTax.getCaWithholding() + californiaTax.getStateDisabilityTax()
                + federalTax.getSocialSecurity() + federalTax.getMedicare() + federalTax.getFedWithholding();
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
        beforeTax = employee.getHrPayRate() * employee.getHoursWorked() + getOvertimePay();

        return roundAmount(beforeTax);
    }

    public double checkAfterTaxes()
    {
        afterTax = beforeTax - taxedAmount();

        return roundAmount(afterTax);
    }

    public double roundAmount(double amount)
    {
        return (double)Math.round(amount * 100) / 100;
    }

    public double getOvertimePay()
    {
        if(employee.isWorkedOvertime())
        {
            overtimePay = employee.getHrPayRate() * employee.getOverTimeHours() * 1.5;

            return roundAmount(overtimePay);
        }else
        {
            return 0;
        }
    }
}
