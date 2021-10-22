package com.company;

class Have extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i <1000){
//            try{                                                      // You can use sleep for pause have program then declare time
//                sleep(10000);
//            }
//            catch (InterruptedException e){
//                System.out.println(e);
//            }
            System.out.println("Hello Amma ji kya kr rhi ho!");
            System.out.println("Hello Baba aap kya kr rhe ho!");
            i++;
        }
    }
}

class Has extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<1000){
            System.out.println("Hello Jee");
            System.out.println("Hello pee");
            i++;
        }
    }
}

public class Class42_Basic_Of_Thread {
    public static void main(String []args){
//        Have h = new Have();
        Have h1 = new Have();
        Has h2 = new Has();

        //h.run();      // It is not throw error but it is not work as a Thread
        //h1.run();

        h1.start();
        h2.start();
    }
}
