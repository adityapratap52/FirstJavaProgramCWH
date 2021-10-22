package com.company;
class Table3{
    void print(int n){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        synchronized (this){
            for (int i=1; i<=6; i++){
                System.out.println(n*i);
                try {
                    Thread.sleep(400);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadUse extends Thread{
    Table3 b;
    ThreadUse(Table3 b){
        this.b = b;
    }
    public void run(){
        b.print(5);
    }
}
class ThreadUse1 extends Thread{
    Table3 b;
    ThreadUse1(Table3 b){
        this.b = b;
    }
    public void run(){
        b.print(10);
    }
}
public class Class52_Synchronized_Block_Thread {
    public static void main(String[] args) {
        Table3 tt = new Table3();
        ThreadUse t1 = new ThreadUse(tt);
        t1.start();
        ThreadUse1 t2 = new ThreadUse1(tt);
        t2.start();
    }
}

// Using with annonymous class
//class Table3{
//    void print(int n){
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//        synchronized (this){
//            for (int i=1; i<=5; i++){
//                System.out.println(n*i);
//                try {
//                    Thread.sleep(400);
//                }catch (Exception e){
//                    System.out.println(e);
//                }
//            }
//        }
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//    }
//}
//
//public class Class52_Synchronized_Block_Thread {
//    public static void main(String[] args) {
//        Table3 tt = new Table3();
//        Thread t1 = new Thread(){
//            public void run(){
//                tt.print(3);
//            }
//        };
//        t1.start();
//        Thread t2 = new Thread(){
//            public void run()
//            {
//                tt.print(4);
//            }
//        };
//        t2.start();
//    }
//}