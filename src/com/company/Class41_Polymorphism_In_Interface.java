package com.company;
interface MyCamera1{
    void takePic();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Record 4K Video");    // after declaration in implements class it is not off
    }
}
interface MyWifi1{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone1 extends MyCellPhone1 implements MyCamera1,MyWifi1{
    public void takePic(){
        System.out.println("Taking Picture...");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public String [] getNetwork(){
        System.out.println("Getting List of Network");
        String [] networkList = {"Harry","Prashant","Mohandas"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    void display(){
        System.out.println("Display the content");
    }
}
public class Class41_Polymorphism_In_Interface {
    public static void main(String[] args) {
        MySmartPhone1 m = new MySmartPhone1();  // It will access all methods and classes
        MyWifi1 w = new MySmartPhone1();  // This is a Smartphone but you can use as a Wifi
        //w.recordVideo();   // It gives error bcz recordVideo is part of MyCamera not part of MyWifi
        //w.display();        // It gives error bcz display is part of MySmartPhone not part of MyWifi
        w.connectToNetwork("3");
    }
}
