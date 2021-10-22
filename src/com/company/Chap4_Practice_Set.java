package com.company;

import java.util.Scanner;

public class Chap4_Practice_Set {
    public static void main(String[] args) {

        //Question 1 - This Program will run or not
//        int a = 23;
//        if (a = 34)                             // It gives error so program will not execute
//            System.out.println("I am 34");
//        else
//            System.out.println("I am not 34");

//        Question 2 - Check Student is pass or not , each subject to pass 33% and overall 40%
//        int math,english,hindi;
//        Scanner std = new Scanner(System.in);
//        System.out.print("Enter Math Number: ");
//        math = std.nextInt();
//        System.out.print("Enter Math Number: ");
//        english = std.nextInt();
//        System.out.print("Enter Math Number: ");
//        hindi = std.nextInt();
//        float per = ((math + english + hindi) * 100f) / 300;
//        System.out.println(per);
//
//        if (per >= 40 && math >= 33 && english >= 33 && hindi >=33)
//        {
//            System.out.println("Pass");
//        }
//        else
//        {
//            System.out.println("Fail");
//        }

//        Question 3 - Calculate income tax slab
//        int income;
//        float tax = 0;
//        System.out.println("Please Enter your Income amount: ");
//        Scanner sc = new Scanner(System.in);
//        income = sc.nextInt();
//        System.out.println("Your income: "+income);
//        if (income > 250000 && income <= 500000)
//        {
//            tax = tax + (income -250000)* 0.05f;
//        }
//
//        else if (income > 500000 && income <= 1000000)
//        {
//            tax = tax + (500000f - 250000f)*0.05f;
//            tax = tax + (income - 500000)* 0.2f;
//        }
//
//         else if (income > 1000000)
//        {
//            tax = tax + (500000f - 250000f)*0.05f;
//            tax = tax + (1000000f - 500000f)*0.2f;
//            tax = tax + (income - 1000000)* 0.3f;
//        }
//        else
//        {
//            System.out.println("You are Tax free!");
//        }
//        System.out.println("Tax on your income: " + tax);

        // Question 4 - Check the day by input  1 for monday,......and so on
//        int day;
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter the Number for checking the day: ");
//        day = sc.nextInt();
//
//        switch (day)
//        {
//            case 1:  System.out.println("Monday");
//            break;
//
//            case 2: System.out.println("Tuesday");
//            break;
//
//            case 3:  System.out.println("Wednesday");
//            break;
//
//            case 4: System.out.println("Thursday");
//            break;
//
//            case 5:  System.out.println("Friday");
//            break;
//
//            case 6: System.out.println("Saturday");
//            break;
//
//            case 7: System.out.println("Sunday");
//            break;
//
//            default: System.out.println("Your Input is not correct");
//        }

        // Question 5 - Check Year is Leaf year or not
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a year for check that this is Leaf year or not: ");
//            int year = sc.nextInt();
//
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println("This is Leaf Century");
//                }
//                else {
//                    System.out.println("This is not Leaf Century");
//                }
//            }
//            else {
//                if (year % 4 == 0) {
//                    System.out.println("This is Leap year");
//                }
//                else {
//                    System.out.println("This is not Leaf year");
//                }
//            }

        // Question 6 - Check to website
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website URL: ");
        String name = sc.nextLine();
        if ((name.endsWith(".com")))
        {
            System.out.println("This is Commercial Website");
        }
        else if ((name.endsWith(".in")))
        {
            System.out.println("This is Indian Website");
        }
        else if ((name.endsWith(".org")))
        {
            System.out.println("This is Organization Website");
        }
        else
        {
            System.out.println("Your Input is not Correct");
        }
    }
}
