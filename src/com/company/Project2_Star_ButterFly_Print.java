package com.company;
import java.util.Scanner;
public class Project2_Star_ButterFly_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of Rows to Print Butterfly: ");
        int r = sc.nextInt();
        int R = (r-1)*2;
        for (int i=1; i<=r; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for (int j=1; j<=R; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            R = (R-2);
        }
        R = 1;
        for (int i=r; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for (int j=2; j<(R*2); j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            R++;
            System.out.println();
        }
    }
}
