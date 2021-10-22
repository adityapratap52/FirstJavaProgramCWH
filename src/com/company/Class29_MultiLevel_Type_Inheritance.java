package com.company;
class GrandFather{
    public void Most_Care(){
        System.out.println("Grandfather.....");
    }
}

class Father extends GrandFather{
    public void Care(){
        this.Most_Care();
        System.out.println("Father.....");
    }
}

class Child extends Father{
    public void Fun(){
        this.Care();
        System.out.println("Child.....");
    }
}

public class Class29_MultiLevel_Type_Inheritance {
    public static void main(String[] args) {
        Child c = new Child();

        // Grandfather
        System.out.println("--------Grandfather + Father + Child--------");
        c.Most_Care();

        // Grandfather + Father
        System.out.println("\n--------Grandfather + Father--------");
        c.Care();

        // Grandfather + Father + Child
        System.out.println("\n--------Grandfather--------");
        c.Fun();
    }
}
