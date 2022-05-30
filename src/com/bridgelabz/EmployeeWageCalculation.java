package com.bridgelabz;

public class EmployeeWageCalculation {

    public static final int wagePerHour = 20;
    public static final int workingDayPerMonth = 20;
    public static final int monthlyWorkingHours = 100;
    public static final int fullTimeHour = 1;
    public static final int partTimeHour = 2;

    public static void main(String[] args) {
        EmployeeWageCalculation wage = new EmployeeWageCalculation();
        wage.calculation();
    }

    private void calculation(){
        int empHours;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours <= monthlyWorkingHours && totalWorkingDays <= workingDayPerMonth);
        totalWorkingDays++;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        switch (empCheck) {
            case fullTimeHour:
                empHours = 8;
                System.out.println("Employee is present for full time");
                break;
            case partTimeHour:
                empHours = 4;
                System.out.println("Employee is present for half time");
                break;
            default:
                empHours = 0;
                System.out.println("Employee is absent");
        }
        totalEmpHours += empHours;
        System.out.println("Day:" + totalWorkingDays +" " + "Emp Hr:" + empHours);

    int totalEmpWage = totalEmpHours * wagePerHour;
        System.out.println("Total Emp Wage = " + totalEmpWage);
}
}
