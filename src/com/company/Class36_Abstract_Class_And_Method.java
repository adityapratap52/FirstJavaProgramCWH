package com.company;

abstract  class Parents{                            // It is a abstract class
    int a = 34;
    public void b(){
        System.out.println("This is method of Parent class");
    }

    abstract void c();                                // If you use abstract method in parent class then you initialize abstract class
    abstract void d();                                 // both abstract method is compulsory use in child1 class otherwise it throw error
}

class Child1 extends Parents{
    public void bb(){
        System.out.println("This is method of Child Class");
    }
    @Override
    void c(){                                           // You can use void c(abstract method) or you can use abstract class to child1 otherwise throw error
        System.out.println("This is First Abstract Class which is define in parents class");
    }
    @Override
    void d(){                                           // You can use void d(abstract method) or you can use abstract class to child1 otherwise throw error
        System.out.println("This is Second Abstract Class which is define in parents class");
    }
}
public class Class36_Abstract_Class_And_Method {
        public static void main(String[] args) {
            Parents cc = new Child1();          // you can call only parents method and abstract method
            //Parents dd = new Parents();       // Parents class is a Abstract so it is not use as a obj only use for references, its throw error
            //cc.b();
            //cc.c();
            //cc.bb();                            // It throw error bcz bb is not define in parents class

            Child1 ss = new Child1();           // you can call parent and child both class method
            ss.b();
            ss.bb();
            ss.c();
        }
}
