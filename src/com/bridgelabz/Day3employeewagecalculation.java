package com.bridgelabz;

import java.util.Random;

public class Day3employeewagecalculation {

    public static final int FULL_TIME_HOUR = 1;
    public static final int PART_TIME_HOUR = 2;

    public static void main(String[] args) {
        System.out.println("WELCOME TO ALL THE EMPLOYEES!!!!");
        System.out.println("********************************");

        Random random = new Random();
        int x1 = random.nextInt(3);

        if (x1 == 1) {
            System.out.println("EMPLOYEE IS PRESENT.");
        } else {
            System.out.println("EMPLOYEE IS ABSENT.");
        }

        System.out.println("********************************");

        int wageperhour = 20;
        int workinghour = 8;
        int workingdays = 20;
        int dailyincome = wageperhour * workinghour;
        System.out.println("Daily income = "+dailyincome);

        System.out.println("********************************");

        int EMP_FULL_TIME = 1;
        int EMP_PART_TIME = 2;

        int x2 = random.nextInt(3);

        if (x2 == 1) {
            dailyincome = wageperhour * workinghour;
            System.out.println("Daily income = "+dailyincome);
        }
        else {
            dailyincome = wageperhour * workinghour;
            dailyincome = dailyincome / 2;
            System.out.println("Daily income = " + dailyincome);
        }
        System.out.println("********************************");

        int empHours;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

        switch (empCheck) {
            case FULL_TIME_HOUR:
                empHours = 8;
                System.out.println("EMPLOYEE IS PRESENT FOR FULL TIME");
                break;
            case PART_TIME_HOUR:
                empHours = 4;
                System.out.println("EMPLOYEE IS PRESENT FOR PART TIME");
                break;
            default:
                empHours = 0;
                System.out.println("EMPLOYEE IS ABSENT");
        }
        System.out.println("********************************");

        int monthlyIncome = wageperhour*workinghour*workingdays;
        System.out.println("Monthly income = " + monthlyIncome);

        System.out.println("********************************");


    }








    }







