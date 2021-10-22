package com.company;
class My_Thr extends Thread{
    public void run(){

        int i=0;
        while (i<6){
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
            i++;
        }
    }
}
public class Class46_sleep_Thread {
    public static void main(String[] args) {
        My_Thr m = new My_Thr();
        My_Thr m1 = new My_Thr();
        m.start();
        m1.start();
    }
}