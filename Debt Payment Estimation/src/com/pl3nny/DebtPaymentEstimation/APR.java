package com.pl3nny.DebtPaymentEstimation;

public class APR
{
    private double apr;

    public APR(double aprPercent)
    {
        this.apr = aprPercent / 100.00;
    }

    public APR(){}

    public double getApr()
    {
        return apr;
    }

    public void setApr(double apr)
    {
        this.apr = apr / 100.00;
    }
}
