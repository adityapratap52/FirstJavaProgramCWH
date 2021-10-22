package com.company;
class  A{
    int id = 23;
    String name = "Aditya Pratap";

    public void Print(){
        System.out.println("This is base Class");
    }
}
class B extends A{
    float salary = 800000;
    public void Print_val(){
        System.out.println("This is Derived Class");
    }
}
public class Class27_Inheritance_In_Java {
    public static void main(String[] args) {

        A a = new A();
        a.Print();
        System.out.println("Id: "+ a.id);
        System.out.println("Name: "+ a.name);
        //System.out.println("Salary: "+a.salary);  // It is not work ,Salary is depend only B

//        B b = new B();
//        b.Print();
//        b.Print_val();
//        System.out.println("Id: "+ b.id);
//        System.out.println("Name: "+ b.name);
//        System.out.println("Salary: "+b.salary);
    }
}
