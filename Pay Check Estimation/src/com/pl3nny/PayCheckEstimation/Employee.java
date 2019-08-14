package com.pl3nny.PayCheckEstimation;

public class Employee extends People
{
    private String companyName;
    private double hrPayRate;
    private double benefitMedical;
    private double benefitDental;
    private double benefitVision;
    private String medicalGroup;
    private String dentalGroup;
    private String visionGroup;
    private double hoursWorked;
    private double overTimeHours;
    private double yearlyIncome;
    private double bonus;

    private boolean workedOvertime = false;

    public Employee(String name, int age, String companyName, double hrPayRate,
                    int hoursWorked, int overtime, double bonus, double benefitMedical, double benefitDental,
                    double benefitVision, String medicalGroup, String dentalGroup, String visionGroup)
    {
        super(name, age);
        this.companyName = companyName;
        this.hrPayRate = hrPayRate;
        this.hoursWorked = hoursWorked;
        this.overTimeHours = overtime;
        this.benefitDental = benefitDental;
        this.benefitVision = benefitVision;
        this.dentalGroup = dentalGroup;
        this.visionGroup = visionGroup;
        this.bonus = bonus;
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

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public double getOverTimeHours()
    {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours)
    {
        this.overTimeHours = overTimeHours;
    }

    public double getBenefitMedical() {
        return benefitMedical;
    }

    public void setBenefitMedical(double benefitMedical) {
        this.benefitMedical = benefitMedical;
    }

    public String getMedicalGroup() {
        return medicalGroup;
    }

    public void setMedicalGroup(String medicalGroup) {
        this.medicalGroup = medicalGroup;
    }

    public double getTotalBenefits()
    {
        return roundAmount(benefitMedical + benefitDental + benefitVision);
    }

    public double roundAmount(double amount)
    {
        return (double)Math.round(amount * 100.0) / 100.0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean isWorkedOvertime()
    {
        if(overTimeHours > 0)
        {
            workedOvertime = true;
        }

        return workedOvertime;
    }

    public double yearlyIncome()
    {
        yearlyIncome = (hrPayRate * 40 ) * 52;

        return (double)Math.round(yearlyIncome);
    }

    public void printBenefits()
    {
        System.out.println("Medical: " + medicalGroup + " $" + benefitMedical);
        System.out.println("Dental: " + dentalGroup + " $" + benefitDental);
        System.out.println("Vision: " + visionGroup + " $" + benefitVision);
        System.out.println("Benefit deductions: $" + (roundAmount(benefitMedical + benefitVision
                + benefitDental)));
    }

    public void printEmployeeInfo()
    {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee: " + getName());
        System.out.println("Pay Rate: $" + hrPayRate);
        System.out.println("Yearly income before Taxes: $" + yearlyIncome());
    }
}
