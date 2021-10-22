package com.company;

class GenClass<T>{
    T t;
    public GenClass(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
class GenClass1<T,T1>{
    T t;
    T1 t1;
    public GenClass1(T t, T1 t1){
        this.t = t;
        this.t1 = t1;
    }
    public T1 getT1() {
        return t1;
    }

    public T getT() {
        return t;
    }
}

public class Class90_GenericClass_Generic_Part2 {
    public static void main(String[] args) {
        GenClass<Integer> gn = new GenClass<Integer>(23);
        GenClass<String> gn1 = new GenClass<String>("Adi");
        GenClass1<String,Integer> gn2 = new GenClass1<String,Integer>("Pavan",56);
        System.out.println("Name: "+ gn1.getT()+"\nRoll No: "+gn.getT());
        System.out.println("Name: "+ gn2.getT()+"\nRoll No: "+gn2.getT1());
    }
}
