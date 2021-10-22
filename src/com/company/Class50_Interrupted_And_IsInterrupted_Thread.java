package com.company;
class Abc extends Thread {
    public void run() {
//        System.out.println(Thread.interrupted());                         // True->False->False->False.....(Change Exception Status if gives true)
//        System.out.println(Thread.currentThread().isInterrupted());       // True->True->True->True.....
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                System.out.println(Thread.interrupted());                   // It is same work
//                System.out.println(Thread.currentThread().isInterrupted());   // It is not affect
                Thread.sleep(1000);
//                System.out.println(Thread.interrupted());                       // It is not affect
//                System.out.println(Thread.currentThread().isInterrupted());     // It is not affect
                System.out.println("Good Morning!");
            }
        } catch (Exception e) {
            System.out.println("InterruptedException :" + e);
        }
        System.out.println("Good Evening!");
    }
}
public class Class50_Interrupted_And_IsInterrupted_Thread{
    public static void main(String[] args) {
        Abc a = new Abc();
        a.start();
        a.interrupt();
    }
}
