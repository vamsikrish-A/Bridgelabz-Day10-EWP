package com.bridgelabz;

public class EmployeeWage {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages. ");

        double Checkout = Math.floor(Math.random() * 10) % 2;
        if (Checkout == 1) {
            System.out.println("Employee Present.");
            int dailyWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
            System.out.println("Daily employee Wage::" +dailyWage);
        }
        else
            System.out.println("Employee absent.");
    }
}
