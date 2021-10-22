package com.company;

import java.io.IOException;

public class Class60_ExceptionPropagation {
    void m() {
        int a = 50/0;
    }
    void n(){
        m();
        System.out.println("Good Morning");
    }
    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Class60_ExceptionPropagation  e1 = new Class60_ExceptionPropagation ();
        try {
            e1.p();
        }catch (Exception e){
            System.out.println("Exception Handled");
        }
        System.out.println("Hello World");
    }
}
