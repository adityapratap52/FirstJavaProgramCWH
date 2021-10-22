package com.company;

// Java Member inner class Example
class Outer{
    public int a = 23;
    int b = 24;
    private int c = 25;
    protected  int d = 26;
    private void p(){
        System.out.println("Hello");
    }
    class Inner{
        void check(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            p();
        }
    }
}

public class Class62_InnerClassBasic {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner v = o.new Inner();
        v.check();
    }
}
