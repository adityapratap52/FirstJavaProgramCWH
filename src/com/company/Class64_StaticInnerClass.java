package com.company;

class Parent1{
    static int a = 122;
    void greet(){
        System.out.println("Good!");
    }
    static class Child1{          // It is not take non-static variables and methods throw error but non static class contain static method and variables
        static int b = 23;
        static void greet(){
            System.out.println("Good Morning2! "+b);
        }
        void greet1(){
            System.out.println("Good Evening! "+a);
        }
    }
}
public class Class64_StaticInnerClass {
    public static void main(String[] args) {
        Parent1.Child1 c = new Parent1.Child1();
        c.greet1();
        c.greet();

        Parent1.Child1.greet();         // It can use without instance reference

    }
}
