package com.company;
class Table{
    synchronized void printTable(int n){                // It is work on single Object don't use on multiple obj otherwise it is not work
        for (int i=1; i<=15; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}
public class Class51_Synchronized_Method_Thread{
    public static void main(String[] args){
        Table obj = new Table();                                // Creating a Object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}

// Using annonymous class
//class Table1{
//    synchronized void printTable(int n){
//        for(int i=1; i<=5; i++){
//            System.out.println(n*i);
//            try{
//                Thread.sleep(400);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//        }
//    }
//}
//
//public class Class51_Synchronized_Method_Thread{
//    public static void main(String[] args){
//        final Table1 obj = new Table1();
//        Thread t1 = new Thread(){
//            public void run(){
//                obj.printTable(5);
//            }
//        };
//        Thread t2 = new Thread(){
//            public void run(){
//                obj.printTable(100);
//            }
//        };
//        t1.start();
//        t2.start();
//    }
//}