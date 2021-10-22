package com.company;
import java.util.Scanner;
public class Class3_TakeInput {
    public static void main(String[] args) {
        int a;
        int  b;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first No.: ");
        a = sc.nextInt();
        System.out.println("Enter Second No.: ");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The Sum of First and Second Number is: " + sum);
    }
}
