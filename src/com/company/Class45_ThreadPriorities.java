package com.company;

class Priority1 extends Thread{
    public Priority1(String name){
        super(name);
    }
    @Override
    public void run(){
        while (true){
            System.out.println("Thank You "+ this.getName());
        }
    }
}


public class Class45_ThreadPriorities {
    public static void main(String[] args) {
        Priority1 p1 = new Priority1("Aditya");
        Priority1 p2 = new Priority1("Abhay");
        Priority1 p4 = new Priority1("Manoj");
        Priority1 p3 = new Priority1("Prashant");
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p3.setPriority(Thread.NORM_PRIORITY+2);
        p4.setPriority(Thread.MIN_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
