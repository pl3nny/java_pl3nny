package com.company;

public class Account
{
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    //constructor
    public Account(String account, double balance, String customerName, String customerEmail, String phoneNumber)
    {
        this.accountNumber = account;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    // setters and getters;
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }
    public String getCustomerEmail()
    {
        return this.customerEmail;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    //method withdraw and deposit
    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println("Your Balance is now " + this.balance);
    }
    public void withdraw(double amount)
    {
        if(this.balance < amount)
        {
            System.out.println("insufficient funds.");
            System.out.println("Your Balance: " + this.balance);
        }
        else
        {
            this.balance -= amount;
            System.out.println("Your Balance is now " + this.balance);
        }
    }
}
