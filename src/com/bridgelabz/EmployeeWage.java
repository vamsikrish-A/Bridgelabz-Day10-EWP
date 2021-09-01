package com.bridgelabz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public  class EmployeeWage implements ImanageEmpWage{
    public static final int FULL_DAYS_HOUR = 2;
    public static final int PART_DAYS_HOURS = 1;
    private int numOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageLinkedList;
    private Map<String, CompanyEmpWage> companyEmpWageMap;

    public EmployeeWage() {
        companyEmpWageLinkedList = new LinkedList<>();
        companyEmpWageMap = new HashMap<>();
    }
    /** public void addCompanyEmpWage(String company, int wagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,wagePerHour,numOfWorkingDays,maxHoursPerMonth);
        companyEmpWageLinkedList.add(companyEmpWage);
        companyEmpWageMap.put(company, companyEmpWage);}**/


    @Override
    public void empWageSystem(String company, int wagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,wagePerHour,numOfWorkingDays,maxHoursPerMonth);
        companyEmpWageLinkedList.add(companyEmpWage);
        companyEmpWageMap.put(company, companyEmpWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageLinkedList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageLinkedList.get(i);
            companyEmpWage.setTotalEmpWage(this.empWageSystem(companyEmpWage) );
            System.out.println(companyEmpWage);
        }
    }
    public int getTotalEmpWage(String company) {
       return companyEmpWageMap.get((company)).totalEmpWage;
    }



    public int empWageSystem(CompanyEmpWage companyEmpWage) {
        int empHours = 0, totalHrs = 0, totalWorkingDays = 0;
        while (totalHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
            System.out.println("Day#:" + totalWorkingDays + " Emp hr:" + empHours);
        }
        return totalHrs *companyEmpWage.wagePerHour;

    }


    public static void main(String[] args) {
        ImanageEmpWage EmployeeWage = new EmployeeWage();
        EmployeeWage.empWageSystem("Samsung", 25, 26, 100);
        EmployeeWage.empWageSystem("Nokia",24,25,97);
        EmployeeWage.empWageSystem("Sony",25,25,96);
        EmployeeWage.computeEmpWage();
        System.out.println("total Wage for Samsung: "+EmployeeWage.getTotalEmpWage("Samsung"));
        System.out.println("total Wage for Nokia: "+EmployeeWage.getTotalEmpWage("Nokia"));
        System.out.println("total Wage for Sony: "+EmployeeWage.getTotalEmpWage("Sony"));

    }
}
