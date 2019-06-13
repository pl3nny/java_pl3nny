package com.pl3nny.DebtPaymentEstimation;

public class Debt extends APR
{
    private double debtAmount;
    private double payment;
    private double interest;

    public Debt(){}

    public Debt(double debtAmount, double apr)
    {
        super(apr);
        this.debtAmount = debtAmount;
    }

    public double getDebtAmount()
    {
        return debtAmount;
    }

    public void setDebtAmount(double debtAmount)
    {
        this.debtAmount = debtAmount;
    }

    public double getPayment()
    {
        return payment;
    }

    public void setPayment(double payment)
    {
        this.payment = payment;
    }

    public double getInterest()
    {
        return interest;
    }

    public void calcInterest()
    {
        interest = (debtAmount * getApr()) / 12.00;
    }

    public void updateDebtWithInterest()
    {
        debtAmount -= getPayment();
        calcInterest();
        debtAmount += interest;
    }
}
