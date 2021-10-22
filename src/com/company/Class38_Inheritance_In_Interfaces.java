package com.company;

interface Bicycle{
    //void a(){ System.out.println("my name"); }        You can not initialize any method ony declare
    int a = 35;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface MoterBike{
    int b = 67;
    void applyHorn();
    void speedUp(char decrement);
}

class AvonCycle implements Bicycle,MoterBike {
    void sample(){
        System.out.println("This is AvonCycle class Method");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake.....");
    }
    public void speedUp(char increment){
        System.out.println("Speed char Up.....");
    }
    public void speedUp(int increment){
        System.out.println("Speed Num Up.....");
    }
    public void applyHorn(){
        System.out.println("Ringing Horn....");
    }
}
public class Class38_Inheritance_In_Interfaces {
    public static void main(String[] args) {

        /* Interface is also abstract, It is useless because interface is not allow
         to initialize method it is same work because Bicycle reference AvonCycle references.
         It use only when one method is same to another interface class so you choose that
         reference class for print that method properties*/
        System.out.println("\n-------------------------------If Bicycle Reference and AvonCycle Object--------------------------------------");
        Bicycle harry = new AvonCycle();
        harry.applyBrake(1);
        harry.speedUp(1);
        System.out.println(harry.a);
        //harry.applyHorn();        //It is not work bcz applyHorn is not a part of Bicycle

        System.out.println("\n--------------------------------If MoterBike is Reference and AvonCycle Object-------------------------------------");
        MoterBike adi = new AvonCycle();
        adi.applyHorn();
        adi.speedUp('g');
        System.out.println(adi.b);
        //adi.applyBrake(1);          //It is not work bcz applyHorn is not a part of MoterBike

        System.out.println("\n--------------------------------If AvonCycle Reference and AvonCycle Object-------------------------------------");
        AvonCycle av = new AvonCycle();
        av.sample();
        av.applyBrake(1);
        av.speedUp(3);
        av.speedUp('a');
        av.applyHorn();
        System.out.println(av.a);
        System.out.println(av.b);

        //av.a = 345;               // You can not change because a is a final value 

    }
}
