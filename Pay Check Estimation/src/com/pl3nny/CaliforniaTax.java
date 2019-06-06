package com.pl3nny;

public class CaliforniaTax
{
    private double stateDisabilityTax;
    private double stateIncome;

    public CaliforniaTax(double stateDisabilityTax, double stateIncome)
    {
        this.stateDisabilityTax = stateDisabilityTax / 100;
        this.stateIncome = stateIncome / 100;
    }

    public double getStateDisabilityTax()
    {
        return stateDisabilityTax;
    }

    public double getStateIncome()
    {
        return stateIncome;
    }
}
