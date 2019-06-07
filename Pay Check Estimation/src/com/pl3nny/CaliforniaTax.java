package com.pl3nny;

public class CaliforniaTax
{
    private double stateDisabilityTax; // CA OASDI/EE
    private double caWithholding;

    public CaliforniaTax(double stateDisabilityTax, double caWithholding)
    {
        this.stateDisabilityTax = stateDisabilityTax / 100;
        this.caWithholding = caWithholding / 100;
    }

    public double getStateDisabilityTax()
    {
        return stateDisabilityTax;
    }

    public double getCaWithholding()
    {
        return caWithholding;
    }
}
