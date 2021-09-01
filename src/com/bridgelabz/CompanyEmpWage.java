package com.bridgelabz;

public class CompanyEmpWage {
    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public CompanyEmpWage (String company, int wagePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
        this.company = company;
        this.maxHoursPerMonth = maxHrsPerMonth;
        this.numOfWorkingDays = numOfWorkingDays;
        this.wagePerHour = wagePerHour;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " +company+ " is: " +totalEmpWage;
    }
}
