package com.pl3nny.PayCheckEstimation;

public class FederalTax
{
    private double fedWithholding;
    private double socialSecurity; // Federal OASDI/EE
    private double medicare;

    private double OTfedWithholding; // Over time rate for overtime

    public FederalTax()
    {
        this.fedWithholding = 11.57 / 100;
        this.socialSecurity = 6.19 / 100;
        this.medicare = 1.45 / 100;
        this.OTfedWithholding = (2 * this.fedWithholding);
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

    public double getOTfedWithholding()
    {
        return OTfedWithholding;
    }
}
