package com.company;

class Vehicle{
    int cost = 10000;
    String name = "Mahindra";
    public void car_Info(){
        System.out.println("Name: "+name);
        System.out.println("Cost: "+cost);
        //System.out.println("Speed: "+speed);        // It is throw error
    }
}

class Mahindra extends Vehicle{
    int speed = 200;
    public void car_Info1(){
        super.car_Info();
        System.out.println("Name1: "+name);
        System.out.println("Cost1: "+cost);
        System.out.println("Speed1: "+speed);
    }
}
public class Class28_Single_Type_Inheritance {
    public static void main(String[] args) {

        System.out.println("------------Base Class Value-------------");
        Vehicle v = new Vehicle();
        v.car_Info();

        System.out.println("\n------------Derived Class Value-------------");
        Mahindra m = new Mahindra();
        m.car_Info1();
    }
}
