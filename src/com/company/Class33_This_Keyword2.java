package com.company;
class A1{
    // this: to invoke current class constructor
    /*A1(){
        System.out.println("Hiii!");
    }
    A1(int x){
        this();
        System.out.println("Hey!");
    } */

    // this: to invoke current method
    void m(){
        System.out.println("Hello!");
    }

    void n(){
        this.m();
        System.out.println("Good Morning!");
    }
}
public class Class33_This_Keyword2 {
    public static void main(String[] args) {
        A1 a = new A1();

        // this: to invoke current class method
        a.n();
    }
}
