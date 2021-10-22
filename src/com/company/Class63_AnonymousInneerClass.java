package com.company;

// It is Parent class of anonymous class
class Parent{
    void stream(){
        System.out.println("Streaming...");
    }
    void print(){
        System.out.println("Hello World!");
    }
}

class India{
    void scan(){
        System.out.println("Scanning...");
    }
    Parent p = new Parent(){        // It is Parent class obj who is run anonymous method
      void print(){
          System.out.println("This is override method");
      }
      void print1(){                                // It will never work
          System.out.println("This is second");
      }
    };
}

public class Class63_AnonymousInneerClass {
    public static void main(String[] args) {
        India india = new India();
        india.p.print();
        india.p.stream();

        // india.p.print1();        // It is throw error bcz class of print1 has not body it is access only parents class method and variable
        Parent pp = new Parent();
        pp.print();
    }
}
