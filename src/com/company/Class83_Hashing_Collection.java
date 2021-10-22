package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Class83_Hashing_Collection {
    public static void main(String[] args) {
        // Use Parent class HashSet of Child class L.H.S
        /* HashSet<Integer> h1 = new HashSet<>();          // Insertion order are not preserved
        h1.add(1);
        h1.add(2);
        h1.add(3);                                          // It is not work bcz 3 is already exists
        h1.add(4);
        h1.add(3);
        h1.add(null);
         System.out.println(h1);
         */

        // Use child class LinkedHashSet
        LinkedHashSet ls = new LinkedHashSet();          // Insertion order are preserved Unlike HashSet
        ls.add(1);
        ls.add(null);
        ls.add(2);
        ls.add(3);
        ls.add(2);
        ls.add(4);
        System.out.println(ls);
    }
}
