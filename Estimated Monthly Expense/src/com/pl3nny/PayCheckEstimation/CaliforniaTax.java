package com.pl3nny.PayCheckEstimation;

public class CaliforniaTax
{
    private double stateDisabilityTax; // CA OASDI/EE
    private double caWithholding;
    private double OTcaWithholding; // overtime percentage for California

    public CaliforniaTax()
    {
        this.caWithholding = 3.81 / 100;
        this.stateDisabilityTax = 1.00 / 100;
        this.OTcaWithholding = 9.00 / 100;
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
