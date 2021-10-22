package com.company;

public class Class47_JoinMethod_Thread extends Thread{
    static Thread main_thread;
    public void run() {
        int i=0;
        while (i<5){
            try {
                main_thread.join();
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
    public static void main(String[] args){
        main_thread = Thread.currentThread();
        Class47_JoinMethod_Thread e1 = new Class47_JoinMethod_Thread();

        e1.start();
        try {
//            e1.join();
            for (int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}