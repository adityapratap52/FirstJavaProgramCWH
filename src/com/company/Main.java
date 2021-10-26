package com.company;
public class Main{
    public static void cls(){
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception{
        for (int i=0; i<10; i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
