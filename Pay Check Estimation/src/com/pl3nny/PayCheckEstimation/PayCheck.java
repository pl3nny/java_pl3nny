package com.pl3nny.PayCheckEstimation;

public class PayCheck extends Employee
{
    private CaliforniaTax californiaTax;
    private FederalTax federalTax;
    private double beforeTax;
    private double afterTax;
    private double taxedAmount;
    private double OTtaxedAmount;
    private double benefitsDeductions;
    private double overtimePay;
    private double payCheckAfterTaxesAndDeduction;
    private double bonusTaxedAmount;


    public PayCheck(String name, int age, String companyName, double hrPayRate, int hoursWorked, int overtime,
                    double bonus, double benefitMedical, double benefitDental, double benefitVision, String medicalGroup,
                    String dentalGroup, String visionGroup)
    {
        super(name, age, companyName, hrPayRate, hoursWorked, overtime, bonus, benefitMedical, benefitDental, benefitVision,
                medicalGroup, dentalGroup, visionGroup);
        federalTax = new FederalTax();
        californiaTax = new CaliforniaTax();
    }

    private double sumOfTax()
    {
        return californiaTax.getCaWithholding() + californiaTax.getStateDisabilityTax()
                + federalTax.getSocialSecurity() + federalTax.getMedicare() + federalTax.getFedWithholding();
    }

    private double sumOfOTtax()
    {
        return federalTax.getOTfedWithholding() + californiaTax.getOTcaWithholding();
    }

    public double taxedAmount()
    {
        taxedAmount = ((checkBeforeTaxes() - (getBonus() + getOvertimePay())) * sumOfTax()) + (getBonusTaxedAmount() + getOTtaxedAmount());
        return roundAmount(taxedAmount);
    }

    public double benefitsDeductinos()
    {
        this.benefitsDeductions = getBenefitDental() + getBenefitVision();
        return roundAmount(this.benefitsDeductions);
    }

    public double roundAmount(double amount)
    {
        return (double)Math.round(amount * 100.0) / 100.0;
    }

    public double getOvertimePay()
    {
        if(isWorkedOvertime())
        {
            overtimePay = getHrPayRate() * 1.5 * getOverTimeHours();
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

    public double getBonusTaxedAmount()
    {
        bonusTaxedAmount = getBonus() * sumOfOTtax();
        return roundAmount(bonusTaxedAmount);
    }

    public double getPaycheckAfterTaxesAndDeductions()
    {
        payCheckAfterTaxesAndDeduction = checkAfterTaxes() - benefitsDeductinos();
        return roundAmount(payCheckAfterTaxesAndDeduction);
    }

    public CaliforniaTax getCaliforniaTax() {
        return californiaTax;
    }

    public FederalTax getFederalTax() {
        return federalTax;
    }

    public double checkBeforeTaxes()
    {
        beforeTax = (getHrPayRate() * getHoursWorked()) + getOvertimePay() + getBonus();

        return roundAmount(beforeTax);
    }

    public double checkAfterTaxes()
    {
        afterTax = beforeTax - taxedAmount();

        return roundAmount(afterTax);
    }

    public void printCheckInfo()
    {
        System.out.println("Check Before Taxes: $" + checkBeforeTaxes());
        System.out.println("Taxed amount: $" + taxedAmount());

        if(isWorkedOvertime())
        {
            System.out.println("Overtime Pay: $" + getOvertimePay());
            System.out.println("Overtime Taxed amount: $" + getOTtaxedAmount());
        }
        System.out.println("Bonus: $" + getBonus());
        System.out.println("Bonus taxed amount: $" + getBonusTaxedAmount());
        System.out.println();
        System.out.println("Check After Taxes: $" + checkAfterTaxes());
        System.out.println("Check After Taxes and Benefit Deductions: $" + getPaycheckAfterTaxesAndDeductions());
        System.out.println();
    }
}
