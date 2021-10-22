package com.company;
import java.util.*;

public class Class5_CALcu_per_std {
    public static void main(String[] args) {
        String name;
        int h,e,m,s,so;
        int sum, total;
        float per;
        System.out.print("Student enter your name: ");
        Scanner str = new Scanner(System.in);
        name = str.nextLine();
        System.out.print(name + " Enter Total Marks: ");
        total = str.nextInt();
        System.out.print("Please Enter your Hindi Marks: ");
        h = str.nextInt();
        System.out.print("Please Enter your English Marks: ");
        e = str.nextInt();
        System.out.print("Please Enter your Math Marks: ");
        m = str.nextInt();
        System.out.print("Please Enter your Science Marks: ");
        s = str.nextInt();
        System.out.print("Please Enter your Social Science Marks: ");
        so = str.nextInt();
        sum = h + e + m + s + so;
        per = (sum*100f)/total;
        System.out.println(name + "your total marks: " + sum);
        System.out.println("Your Percentage is: " + per);
    }
}
