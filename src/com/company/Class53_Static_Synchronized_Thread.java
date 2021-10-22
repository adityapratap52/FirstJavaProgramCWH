package com.company;
class Table4{
    static synchronized void print(int n){
        for (int i=1; i<=5; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class StaticSyn1 extends Thread{
    public void run(){
        Table4.print(3);
    }
}
class StaticSyn2 extends Thread{
    public void run(){
        Table4.print(5);
    }
}
class StaticSyn3 extends Thread{
    public void run(){
        Table4.print(10);
    }
}
class StaticSyn4 extends Thread{
    public void run(){
        Table4.print(12);
    }
}
public class Class53_Static_Synchronized_Thread {
    public static void main(String[] args) {
        StaticSyn1 s1 = new StaticSyn1();
        StaticSyn2 s2 = new StaticSyn2();
        StaticSyn3 s3 = new StaticSyn3();
        StaticSyn4 s4 = new StaticSyn4();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}

//class Table4{
//    static synchronized void print(int n){
//        for (int i=1; i<=5; i++){
//            System.out.println(n*i);
//            try {
//                Thread.sleep(400);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }
//    }
//}
//
//public class Class53_Static_Synchronized_Thread {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(){
//            public void run(){
//                Table4.print(3);
//            }
//        };
//        t1.start();
//        Thread t2 = new Thread(){
//            public void run(){
//                Table4.print(6);
//            }
//        };
//        t2.start();
//        Thread t3 = new Thread(){
//            public void run(){
//                Table4.print(9);
//            }
//        };
//        t3.start();
//        Thread t4 = new Thread(){
//            public void run(){
//                Table4.print(18);
//            }
//        };
//        t4.start();
//    }
//}