package com.pl3nny;

public class FederalTax
{
    private double fedIncome;
    private double socialSecurity;
    private double medicare;

    public FederalTax(double fedIncome, double socialSecurity, double medicare)
    {
        this.fedIncome = fedIncome / 100;
        this.socialSecurity = socialSecurity / 100;
        this.medicare = medicare / 100;
    }

    public double getFedIncome()
    {
        return fedIncome;
    }

    public double getSocialSecurity()
    {
        return socialSecurity;
    }

    public double getMedicare()
    {
        return medicare;
    }
}
