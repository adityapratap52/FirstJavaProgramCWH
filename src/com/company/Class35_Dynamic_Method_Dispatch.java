package com.company;
class one{
    public void greet(){
        System.out.println("This is greet class!");
    }
    public void name(){
        System.out.println("My name is Java in class one");
    }
}
class Two extends one{
    public void Wel(){
        System.out.println("You are Welcome!");
    }
    public void name(){
        System.out.println("My name is Java in class two");
    }
}
public class Class35_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        one obj = new one();
        Two obj1 = new Two();
        one obj2  = new Two();      // This is called dynamic memory dispatch
        obj2.name();                   // It is run name bcz name is present in both class
//        obj2.Wel();              // It is not a part of both class only run parent class method and same method
    }
}
