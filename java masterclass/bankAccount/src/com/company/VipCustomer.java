package com.company;

public class VipCustomer
{
    private double creditLimit;
    private String customerName;
    private String customerEmail;

    public VipCustomer() { }

    public VipCustomer(double creditLimit, String customerName, String customerEmail)
    {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public VipCustomer(String customerName, String customerEmail)
    {
        this(5000, customerName, customerEmail);    // credit limit default at $5,000 for vip
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public double getCreditLimit()
    {
        return this.creditLimit;
    }

    public String getCustomerEmail()
    {
        return this.customerEmail;
    }
}
