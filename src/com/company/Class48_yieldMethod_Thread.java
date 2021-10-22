package com.company;

public class Class48_yieldMethod_Thread extends Thread{
    public void run(){
        //Thread.yield();
        for (int i=0; i<=5;i++){
            System.out.println("Child Class "+i);
        }
    }
    public static void main(String[] args) {
        Class48_yieldMethod_Thread y = new Class48_yieldMethod_Thread();
        y.start();
        Thread.yield();                 // It is not work on windows
        for (int i=0; i<=5; i++){
            System.out.println("Main " +i);
        }
    }
}
