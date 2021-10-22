package com.company;

import java.util.ArrayDeque;

public class Class82_ArrayDeque_Collection {
    public static void main(String[] args) {
        ArrayDeque st = new ArrayDeque();
        st.add("Amit");
        st.add("Pavan");
        st.add("Rahul");
        st.addFirst("Mohan");                           // we can use offerFirst
        //st.add(2,"Monoj");                               // You can't insert in between bcz it is Queue and rest method is same as other classes and interfaces
        st.addLast("Kumar");                            // addFirst and addLast are present in ArrayDQueue not Queue
        System.out.println(st.getFirst());
        System.out.println(st.getLast());
        System.out.println(st);
    }
}
