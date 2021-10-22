package com.company;
class Customer{
    int amount = 10000;
    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw...");
        if (this.amount<amount) {
            System.out.println("Your Current Balance: " + this.amount + " \nLess Balance; waiting for deposit");
            try {
                wait();
            } catch (Exception e) {
            }
        }
            this.amount = amount;
            System.out.println("withdraw completed...");
        }

    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed...");
        notify();
    }
}
public class Class55_Wait_Notify_NotifyAll_Thread {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}

//class TotalEarning extends Thread{
//    int total = 0;
//    public void run(){
//        synchronized (this) {
//            for (int i = 1; i <= 5; i++) {
//                total += 100;
//            }
//            this.notify();
//        }
//    }
//}
//public class Class55_Wait_Notify_NotifyAll_Thread {
//    public static void main(String[] args) throws InterruptedException{
//        TotalEarning t = new TotalEarning();
//        t.start();
//        synchronized (t){
//            t.wait();
//            System.out.println("Total Earning: "+t.total);
//        }
//
//    }
//}
