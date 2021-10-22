package com.company;

import java.util.Scanner;

public class Class17_Do_While_Loop {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        do {
            System.out.println(i);
            i++;
        }while (i<=n);
    }
}
