package com.company;
interface MyCamera{
    void takePic();
    void recordVideo();
    // If you add extra method  then you add in all class compulsory otherwise error or use default
    static int cube(int x){                // We can use static in same class from here is calling
        return x*x*x;
    }
    default void record4KVideo(){
        System.out.println(cube(3));                // Static method call
        System.out.println("Record 4K Video");      // after declaration it is not work
    }
}
interface MyWifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
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
//    public void record4KVideo(){
//        System.out.println("4K Video");
//    }
}

public class Class39_Default_And_Static_Method_In_Interface {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String [] ar = ms.getNetwork();
        for (String item: ar){
            System.out.println(item);
        }
        ms.connectToNetwork("Connect");
        ms.getNetwork();
        ms.recordVideo();
        ms.takePic();
        ms.pickCall();
        ms.callNumber(4);
        ms.record4KVideo();
        MyCamera c = new MySmartPhone();
        c.record4KVideo();
    }
}
