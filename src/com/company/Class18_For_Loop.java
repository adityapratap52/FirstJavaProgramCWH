package com.company;

import java.util.Scanner;

public class Class18_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // For Incrementing of for Loop
//        for (int i = 1; i <= n; i++)
//        {
//            System.out.println(i);
//        }

        // For Decrementing of for loop
//        for (int i = n; i > 0; i--)
//        {
//            if (i == 5)
//            break;
//            System.out.println(i);
//        }
        for (int i = n; i > 0; i--)
        {
            if (i == 5)
            continue;
            System.out.println(i);
        }
    }
}
