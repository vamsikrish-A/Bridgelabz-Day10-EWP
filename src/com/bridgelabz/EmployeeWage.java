package com.bridgelabz;

public class EmployeeWage {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAYS_HOUR = 2;
    public static final int PART_DAYS_HOURS = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages. ");


        int empHours = 0;

        int checkOut = (int)Math.floor(Math.random() * 10) % 3;
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


        int dailyWage = empHours * WAGE_PER_HOUR;
        System.out.println("Daily employee Wage::" +dailyWage);
    }

}
