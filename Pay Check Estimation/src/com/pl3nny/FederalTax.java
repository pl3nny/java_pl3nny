package com.pl3nny;

public class FederalTax
{
    private double fedWithholding;
    private double socialSecurity; // Federal OASDI/EE
    private double medicare;

    public FederalTax(double fedWithholding, double socialSecurity, double medicare)
    {
        this.fedWithholding = fedWithholding / 100;
        this.socialSecurity = socialSecurity / 100;
        this.medicare = medicare / 100;
    }

    public double getFedWithholding()
    {
        return fedWithholding;
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
