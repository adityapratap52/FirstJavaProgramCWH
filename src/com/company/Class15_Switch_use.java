package com.company;
import java.util.Scanner;
public class Class15_Switch_use {
    public static void main(String[] args) {
        String a;
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        a = SC.next();


        switch (a)
        {
            case "a":
                System.out.println("Good Morning!");
                break;

            case "b":
                System.out.println("Good After Noon!");
                break;

            default:
                System.out.println("Good Night!");
                break;
        }
    }
}
