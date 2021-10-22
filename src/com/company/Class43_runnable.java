package com.company;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<20000;i++){
            System.out.println("I am a thread 1 not a threat 1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<20000;i++){
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}
public class Class43_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullets1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullets1);

        MyThreadRunnable2 bullets2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullets2);

        gun1.start();
        gun2.start();
    }
}
