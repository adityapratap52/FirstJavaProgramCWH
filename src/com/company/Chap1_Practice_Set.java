package com.company;
import java.util.Scanner;
public class Chap1_Practice_Set {
    public static void main(String[] args) {

      //// Question number 1 - Sum of three numbers
//        int a, b, c;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter First No.: ");
//        a = sc.nextInt();
//        System.out.print("Enter Second No.: ");
//        b = sc.nextInt();
//        System.out.print("Enter Third No.: ");
//        c = sc.nextInt();
//        int sum = a + b + c;
//        System.out.println("\nSum of first, second and third input: " + sum);

        ////Question 2 - Calculate CGPA
        int m, e, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Math Marks: ");
        m = sc.nextInt();
        System.out.print("Enter English Marks: ");
        e = sc.nextInt();
        System.out.print("Enter Science Marks: ");
        s = sc.nextInt();
        float sum = m + e + s;
        float cgpa = sum/30;
        System.out.println("CGPA of Math, English and Science: " + cgpa);

        //// Question 3 - Ask his/her name add "Hello <name> have a good day
//        String name;
//        System.out.print("Enter your name: ");
//        Scanner sc = new Scanner(System.in);
//        name = sc.nextLine();
//        System.out.println("Hello " + name + " have a good day");

        //// Question 4 - Check input number is integer or not
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number to check it is integer or not: ");
//        boolean b = sc.hasNextInt();
//        System.out.println(b);

        //// Question 5 - Convert Kilometers to Miles
//        System.out.print("Enter Miles value: ");
//        Scanner sc = new Scanner(System.in);
//        float miles = sc.nextFloat();
//        float km = miles*1.609f;
//        System.out.println("Kilometer is: " + km);
    }
}
