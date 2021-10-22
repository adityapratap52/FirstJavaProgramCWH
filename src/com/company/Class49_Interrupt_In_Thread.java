package com.company;
class Interrupting extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);                     // If you do not use sleep method than interrupt method is not work
            }
        } catch (Exception e) {
            System.out.println("Interrupt Exception :" + e);          // It is exit only try-catch method
//            throw new RuntimeException("InterruptedException: "+e);     // It is exit this run method
        }
        System.out.println("Good Evening!");
    }
}
public class Class49_Interrupt_In_Thread {
    public static void main(String[] args) {
        Interrupting i = new Interrupting();
        i.start();
        i.interrupt();
    }
}
