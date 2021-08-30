package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages. ");

        double Checkout = Math.floor(Math.random() * 10) % 2;
        if (Checkout == 1)
            System.out.println("Employee Present.");
        else
            System.out.println("Employee absent.");
    }
}
