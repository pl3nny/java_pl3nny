package com.pl3nny.PayCheckEstimation;

public class PayCheck
{
    private Employee employee;
    private CaliforniaTax californiaTax;
    private FederalTax federalTax;
    private double beforeTax;
    private double afterTax;
    private double taxedAmount;
    private double OTtaxedAmount;
    private double benefitsDeductions;
    private double overtimePay;

    public PayCheck()
    {
        californiaTax = new CaliforniaTax();
        federalTax = new FederalTax();
        employee = new Employee();
    }

    public PayCheck(Employee employee, CaliforniaTax californiaTax, FederalTax federalTax)
    {
        this.employee = employee;
        this.californiaTax = californiaTax;
        this.federalTax = federalTax;
        this.overtimePay = 0;
        this.OTtaxedAmount = 0;
    }

    private double sumOfTax()
    {
        return californiaTax.getCaWithholding() + californiaTax.getStateDisabilityTax()
                + federalTax.getSocialSecurity() + federalTax.getMedicare() + federalTax.getFedWithholding();
    }

    private double sumOfOTtax()
    {
        return sumOfTax() - californiaTax.getCaWithholding() - federalTax.getFedWithholding() + federalTax.getOTfedWithholding()
                + californiaTax.getOTcaWithholding();
    }

    public double taxedAmount()
    {
        taxedAmount = checkBeforeTaxes() * sumOfTax();
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
        afterTax = beforeTax - (taxedAmount + OTtaxedAmount);

        return roundAmount(afterTax);
    }

    public double roundAmount(double amount)
    {
        return (double)Math.round(amount * 100.0) / 100.0;
    }

    public double getOvertimePay()
    {
        if(employee.isWorkedOvertime())
        {
            overtimePay = employee.getHrPayRate() * 1.5 * employee.getOverTimeHours();
            return roundAmount(overtimePay);
        }else
        {
            return 0.00;
        }
    }

    public double getOTtaxedAmount()
    {
        OTtaxedAmount = getOvertimePay() * sumOfOTtax();

        return roundAmount(OTtaxedAmount);
    }

    public Employee getEmployee()
    {
        return employee;
    }

    public CaliforniaTax getCaliforniaTax()
    {
        return californiaTax;
    }

    public FederalTax getFederalTax()
    {
        return federalTax;
    }
}
