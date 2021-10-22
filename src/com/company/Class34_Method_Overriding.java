package com.company;
class first{
    public void m() {
        System.out.println("hiii");
    }
}
class second extends first {
    @Override                                // It is not compulsory but recommended
    public void m() {                       // It is overriding method because it is same to  parent method
        System.out.println("hii");
    }

}

public class Class34_Method_Overriding{
    public static void main(String[] args) {
        second fs = new second();
        fs.m();
    }
}