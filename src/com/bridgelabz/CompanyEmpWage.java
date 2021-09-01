package com.bridgelabz;

public class CompanyEmpWage {
    public final String company;
    public final int wagePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public CompanyEmpWage (String company, int wagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.maxHoursPerMonth = maxHoursPerMonth;
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
