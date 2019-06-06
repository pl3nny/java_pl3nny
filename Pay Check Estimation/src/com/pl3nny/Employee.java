package com.pl3nny;

public class Employee extends People
{
    private String companyName;
    private double hrPayRate;
    private double benefitDental;
    private double benefitVision;
    private String dentalGroup;
    private String visionGroup;
    private int hoursWorked;

    public Employee(String name, int age, String companyName, double hrPayRate, int hoursWorked, double benefitDental, double benefitVision, String dentalGroup, String visionGroup)
    {
        super(name, age);
        this.companyName = companyName;
        this.hrPayRate = hrPayRate;
        this.hoursWorked = hoursWorked;
        this.benefitDental = benefitDental;
        this.benefitVision = benefitVision;
        this.dentalGroup = dentalGroup;
        this.visionGroup = visionGroup;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public double getHrPayRate()
    {
        return hrPayRate;
    }

    public double getBenefitDental()
    {
        return benefitDental;
    }

    public double getBenefitVision()
    {
        return benefitVision;
    }

    public String getDentalGroup()
    {
        return dentalGroup;
    }

    public String getVisionGroup()
    {
        return visionGroup;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }
}
