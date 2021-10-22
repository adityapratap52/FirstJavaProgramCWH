package com.company;

class Outer1{
    int a = 3;
    void localMethod(){
        int b =4;
        System.out.println("Hello World!");
        class Inner1{
            int c =5;
            void localInnerMethod(){
                System.out.println("Good Morning!...");
                System.out.println(a + b + c);
            }
        }
        Inner1 i = new Inner1();
        i.localInnerMethod();
    }
}
public class Class65_LocalInnerClass {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.localMethod();
    }
}
