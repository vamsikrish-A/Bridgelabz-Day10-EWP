package com.bridgelabz;

public class EmployeeWage {


    public static final int FULL_DAYS_HOUR = 2;
    public static final int PART_DAYS_HOURS = 1;



    public static  int empWageSystem(String company, int wagePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
        int empHours = 0,  empWagePerMonth = 0, totalHrs = 0, totalWorkingDays = 0;
        while (totalHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
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
        int totalEmpWage = totalHrs * wagePerHour;
        System.out.println("Employee per month::"+totalEmpWage);
        return totalEmpWage;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages. ");
        System.out.println("Welcome to Employee Wage system for BIG BAZAR.");
        empWageSystem("Big Bazar",20,20,100);
        System.out.println("Welcomr to Employee Wage system for SAMSUNG.");
        empWageSystem("SAMSUNG",30,25,80);
        System.out.println("Welcomr to Employee Wage System for NOKIA.");
        empWageSystem("Nokia", 28,23,105);


    }

}
