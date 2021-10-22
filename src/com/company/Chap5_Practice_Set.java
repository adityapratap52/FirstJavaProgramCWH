package com.company;

import java.util.Scanner;

public class Chap5_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1 - Print Star Pattern
//        System.out.printf("Enter a number for print Star: ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = n; j > i; j--)
//            {
//                System.out.printf("* ");
//            }
//            System.out.println("");
//        }

        // Question 2 - sum first n even numbers using while loop
//        System.out.println("Enter a num for sum even values: ");
//        int n = sc.nextInt();
//        int i = 0 ;
//        int sum = 0;
//        while (i<n)
//        {
//            sum = sum + (2 * i);
//            i++;
//        }
//        System.out.printf("Sum of %d even No. = %d",n,sum);

        // Question 3 - Multiplication table of a given number n.
//        System.out.println("Enter a num for Multiplication Table: ");
//        int n = sc.nextInt();
//        System.out.println("\n");
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

        // Question 4 - Print Multiplication table of n in reverse order
//        System.out.println("Enter a num for Reverse Multiplication Table: ");
//        int n = sc.nextInt();
//        System.out.println("\n");
//        for (int i = 10; i >= 1; i--)
//        {
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

        // Question 5 - Factorial of given no.
//        System.out.println("Enter a num for Factorial: ");
//        int n = sc.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= n; i++)
//        {
//           fact = fact * i;
//        }
//        System.out.printf("%d \n",fact);

        // Question 6 - Repeat 5 using while loop
//            int i = 0;
//            while (i<5)
//            {
//                System.out.println(5);
//                i++;
//            }

        // Question 7 - Repeat 1 using for loop
//            for (int i = 0; i < 5; i++)
//            {
//                System.out.println(1);
//            }

        // Question 8 - Sum of Multiplication Table
        System.out.println("Enter a num for Sum of Multiplication Table: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            sum += n*i;
        }
        System.out.printf("Sum of Multiplication table of %d = %d\n",n,sum);
    }
}
