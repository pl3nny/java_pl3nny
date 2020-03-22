package com.pl3nny.PayCheckEstimation;

public class CaliforniaTax
{
    private double stateDisabilityTax; // CA OASDI/EE
    private double caWithholding;
    private double OTcaWithholding; // overtime percentage for California

    public CaliforniaTax()
    {
        this.caWithholding = 4.2 / 100;
        this.stateDisabilityTax = 1.00 / 100;
        this.OTcaWithholding = (2 * this.caWithholding);
    }

    public double getStateDisabilityTax()
    {
        return stateDisabilityTax;
    }

    public double getCaWithholding()
    {
        return caWithholding;
    }

    public double getOTcaWithholding()
    {
        return OTcaWithholding;
    }
}
