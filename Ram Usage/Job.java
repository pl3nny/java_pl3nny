package com.company;

public class Job
{
    private String job;
    private String user;
    private double ram;
    private double start;
    private double end;

    public Job(String job, String user, double ram, double start, double end)
    {
        this.job = job;
        this.user = user;
        this.ram = ram;
        this.start = start;
        this.end = end;
    }
    public Job(){};

    public void setJob(String job)
    {
        this.job = job;
    }

    public String getJob()
    {
        return job;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getUser()
    {
        return user;
    }

    public void setRam(double ram)
    {
        this.ram = ram;
    }

    public double getRam()
    {
        return ram;
    }

    public void setStart(double start)
    {
        this.start = start;
    }

    public double getStart()
    {
        return start;
    }

    public void setEnd(double end)
    {
        this.end = end;
    }

    public double getEnd()
    {
        return end;
    }

}
