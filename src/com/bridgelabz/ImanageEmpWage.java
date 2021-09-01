package com.bridgelabz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public interface ImanageEmpWage {
    public void empWageSystem(String company, int wagePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalEmpWage(String company);

}
