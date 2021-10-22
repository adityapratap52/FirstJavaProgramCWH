package com.company;

@FunctionalInterface
interface A01{
    void write();
    default void run12(){
        System.out.println("This is method1");
    }
}

interface A02{
    default void run12(){
        System.out.println("This is method2");
    }
}
class B01 implements A01,A02{
    public void write(){
        System.out.println("This is B01 Method");
    }
    public void run12(){
        A02.super.run12();
    }
}

public class Class39_DefaultExp {
    public static void main(String... args){
        A01 a = new B01();
        a.write();
        a.run12();
    }
}
