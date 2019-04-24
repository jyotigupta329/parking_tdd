package com.cognizant.model;

public class Garage {
    private final static int dailyPrice = 5 ;
    private double inTime;
    private double outTime;
    private boolean isMonthly;

    public static int getDailyPrice() {
        return dailyPrice;
    }

    public double getInTime() {
        return inTime;
    }

    public void setInTime(double inTime) {
        this.inTime = inTime;
    }

    public double getOutTime() {
        return outTime;
    }

    public void setOutTime(double outTime) {
        this.outTime = outTime;
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    public void setMonthly(boolean monthly) {
        isMonthly = monthly;
    }


    public double getCalculatedTime() {
        return getInTime() + getOutTime();
    }

    public boolean getMonthlyPass() {
        return true;
    }
}
