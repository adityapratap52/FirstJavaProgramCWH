package com.company;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank You");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class Class44_thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Adi");
        MyThr t1 = new MyThr("Harry");
        t.start();
        t1.start();
        System.out.println("The id of the thread t is "+t.getId());
        System.out.println("The name of the thread t is "+t.getName());
        System.out.println("The id of the thread t is "+t1.getId());
        System.out.println("The name of the thread t is "+t1.getName());
    }
}
