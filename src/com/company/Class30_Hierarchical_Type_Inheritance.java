package com.company;
class Animal{
    public void eat(){
        System.out.println("eating.....");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("barking.....");
        this.eat();
    }
}

class Cat extends Animal{
    public void miow(){
        System.out.println("miowing.....");
        this.eat();
    }
}
public class Class30_Hierarchical_Type_Inheritance {
    public static void main(String[] args) {
        Cat d = new Cat();
        d.miow();
    }
}
