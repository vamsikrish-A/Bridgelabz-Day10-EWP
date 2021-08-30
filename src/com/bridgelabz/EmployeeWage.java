package com.bridgelabz;

public class EmployeeWage {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOURS = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages. ");

        int partTime = 1;
        int fullTIme = 2;
        int empHours = 0;

        double Checkout = Math.floor(Math.random() * 10) % 3;
        if (Checkout == fullTIme) {
            System.out.println("Employee Present.");
            empHours = FULL_DAY_HOUR;

        }
        else if (Checkout == partTime) {
            System.out.println("part time");
            empHours = PART_TIME_HOURS;
        }
        else {
            System.out.println("Employee Absent.");
        }

        int dailyWage = empHours * WAGE_PER_HOUR;
        System.out.println("Daily employee Wage::" +dailyWage);
    }

}
