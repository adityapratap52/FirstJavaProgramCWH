package com.company;
class X{
    X(){
        System.out.println("This is Default X Constructor");
    }

    X(int x){
        System.out.println("This is Parameterized X Constructor with value of x as: "+x);
    }
}

class Y extends X{
    Y(){
        System.out.println("This is Default Y Constructor");
    }
    Y(int x,int y){
        super (x);
        System.out.println("This is Parameterized Y Constructor Which contain y: "+y);
    }
}

class Z extends Y{
    Z(){
        System.out.println("This is Default Z Constructor");
    }
    Z(int x,int y, int z){
        super (x,y);
        System.out.println("This is Parameterized Z Constructor Which contain z: "+z);
    }
}
public class Class31_Inheritance_In_Constructor {
    public static void main(String[] args) {
        //X x = new X();            // Run only Default X Constructor
        //X x = new X(2);            // Run only Parameterized X Constructor

//        Y y = new Y();              // Run Both Default X and Default Y Constructor
//        Y y = new Y(2);              // Run Both Parameterized X and Parameterized Y Constructor

        Z z = new Z(3,4,5);
    }
}
