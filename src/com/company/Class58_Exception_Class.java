package com.company;

import java.io.IOException;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return " I am toString";
    }

    @Override
    public String getMessage() {
        return " I am getMessage";
    }
}

public class Class58_Exception_Class{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your age: ");
        a = sc.nextInt();
        try {
            if (a<99) {
//                throw new ArithmeticException("This is Arithmetic Exception bcz your input is low from 99");
//                throw new MyException();
                throw new IOException("device");
            }
        }catch (Exception e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            System.out.println(e);                  // default toString
//            if(a == 56){                             // Let
//                System.exit(0);
//            }
//            e.printStackTrace();
            System.out.println("Finish..");
        }
        System.out.println("Yes Finished..");
    }
}
