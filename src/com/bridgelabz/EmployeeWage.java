package com.bridgelabz;

public class EmployeeWage {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAYS_HOUR = 2;
    public static final int PART_DAYS_HOURS = 1;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;


    public static  int empWageSystem() {
        int empHours = 0,  empWagePerMonth = 0, totalHrs = 0, totalWorkingDays = 0;
        while (totalHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int checkOut = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkOut) {
                case FULL_DAYS_HOUR:
                    empHours = 8;
                    break;
                case PART_DAYS_HOURS:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            totalHrs += empHours;
            System.out.println("Day#:"+totalWorkingDays + " Emp hr:"+empHours);
        }

        System.out.println("Employee total Hours ::"+totalHrs);
        int totalEmpWage = totalHrs * WAGE_PER_HOUR;
        System.out.println("Employee per month::"+totalEmpWage);
        return totalEmpWage;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages. ");
        empWageSystem();


    }

}
