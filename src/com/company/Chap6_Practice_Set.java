package com.company;

import java.util.Scanner;

public class Chap6_Practice_Set {
    public static void main(String[] args) {

        //  Question 1 - Sum of  5 float array values
//        float []arr = {2.5f,3.5f,4.5f,5.5f,6.5f};
//        float sum = 0;
//        for(float i : arr)
//        {
//            sum += i;
//        }
//        System.out.println(sum);

        // Question 2 - Check given integer is present in array or not
//            int arr[] = {1,2,3,4,5,6,7,8};
//            boolean a = false;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number for check that this value is present in array or not:");
//            int n = sc.nextInt();
//            for (int i : arr)
//            {
//                if (i == n)
//                {
//                    a = true;
//                    break;
//                }
//            }
//            if (a)
//            {
//                System.out.println("This Value is Exists into Array");
//            }
//            else
//            {
//                System.out.println("Not Exist!");
//            }

        // Question 3 - Average marks o all students in Physics using for each loop
//            int []arr = new int[10];
//            System.out.println("Enter total students for average Physics no: ");
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int sum = 0;
//            for (int i = 0; i < n; i++)
//            {
//                System.out.printf("Enter %d Student Physics Number: ",i+1);
//                arr[i] = sc.nextInt();
//                sum += arr[i];
//            }
//            float avg = (float)sum/n;
//            System.out.println( "The Value of average marks is: "+avg);

        // Question 4 - Create a java program to add two matrix of size  2X3
//        int [][] arr = new int[2][3];
//        int [][] arr1 = new int[2][3];
//        int [][] arr2 = new int[2][3];
//        int [][] result = new int[2][3];
//        Scanner sc = new Scanner(System.in);
//        for(int f = 0; f < 2; f++) {
//            System.out.printf("Enter %d Matrix Values: ",f+1);
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 3; j++) {
//                    arr[i][j] = sc.nextInt();
//                }
//            }
//            if (f == 0) {
//                arr2 = arr;
//                arr = arr1;
//            }
//        }
//        for(int f = 0; f < 2; f++) {
//            System.out.printf("Your %d Matrix is: \n",f+1);
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 3; j++) {
//                    System.out.printf("%d\t",arr2[i][j]);
//                }
//                System.out.println();
//            }
//            if (f == 0) {
//                arr = arr2;
//                arr2 = arr1;
//            }
//        }
//        for (int i  = 0; i < 2; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                result[i][j] = arr[i][j] + arr2[i][j];
//            }
//        }
//        System.out.println("\nYour matrix is: ");
//        for (int i  = 0; i < 2; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                System.out.print(result[i][j]+"\t");
//            }
//            System.out.println();
//        }

        //Question 5 - Reverse an Array
//        int a[] = {1,2,3,4,5,6,7,8,9,10};
//        int b[] = new int[a.length];
//        for (int i = 0; i < (a.length); i++)
//        {
//            b[i] = a[a.length-i-1];
//        }
//        for (int i = 0; i < a.length; i++)
//        {
//            System.out.println(b[i]);
//        }
                                                    //----------OR---------//

//            int arr[] = {1,2,3,4,5,6,7,8,9,10};
//            int l = arr.length;
//            int n = Math.floorDiv(l,2);         // For Divide two values, it takes only int values
//            int temp;
//            for (int i = 0; i < n; i++)
//            {
//                temp = arr[i];
//                arr[i] = arr[l-i-1];
//                arr[l-i-1] = temp;
//            }
//            for (int element: arr)
//            {
//                System.out.println(element);
//            }

            // Question 6 - find the maximum element in an array
//            int []arr = {1,2,3,4,5,6};
//            int max = 0;
//            for (int a: arr)
//            {
//                if (a > max)
//                {
//                    max = a;
//                }
//            }
//            System.out.println("Maximum value of this array is:"+max);

            // Question 7 - find the minimum element in an array
//            int []arr = {1,2,3,4,5,6};
//            int min = 2;
//            for (int a: arr)
//            {
//                if (a < min)
//                {
//                    min = a;
//                }
//            }
//            System.out.println("Minimum value of this array is:"+min);
            // Check value of max int and min int
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

            // Question 8 - Check array is sorted or not
            int []arr = {2,3,4,5,6,7,8,0};      // Assending order
            boolean a = true;
            for (int i = 0; i < arr.length-1; i++)
            {
                if (arr[i] > arr[i+1])
                {
                    a = false;
                    break;
                }
            }
            if (a)
            {
                System.out.println("The list is sorted");
            }
            else
            {
                System.out.println("List is not sorted");
            }
    }
}
