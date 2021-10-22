package com.company;

class Gen{
    public <I> void add(I []arr){                 // You can use Any Capital/small letter/word instead of I. Type parameter only referenced type

        //for (int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
        //}

        for (I e: arr) {
            System.out.println(e);
        }
    }

    public <I> void add(I []a, I []b){
        for (int i=0;i<a.length;i++) {                 // When a = b  --> Quantity
            System.out.println("Name: "+a[i]+" Roll No: "+b[i]);
        }
    }
}

public class Class90_GenericMethod_Generic_Part1 {
    public static void main(String[] args) {
        Gen g = new Gen();
        String []str = new String[]{"Aditya","Vans","Rahul","Ganesh"};      // or String []str = {"Aditya","Vans","Rahul","Ganesh"};
        Integer []it = new Integer[]{1,3,5,6};                            // same here
        Float []ft = {1.2f,3.5f,6.7f,8.9f};                                 // Not use primitive data type(int, char, float,.....)
        g.add(str);
        g.add(it);
//        g.add(ft);
        g.add(str,it);
    }
}
