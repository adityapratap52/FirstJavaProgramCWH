package com.company;
interface Use{
    void hii();
//    private void greet12(){                     // Intellij idea is older version so private is not work
//        System.out.println("Good Morning!");
//    }
    default void call(){
//        greet12();
        System.out.println("Mai hoon naa");
    }
}
class check implements Use{
    public void hii(){
        System.out.println("hii");
    }
//    public void call(){
//        System.out.println("me hoo");
//    }
}
public class Class40_Private_Method_In_Interface {
    public static void main(String[] args) {
        Use u = new check();
        u.hii();
//        u.call();

    }
}
