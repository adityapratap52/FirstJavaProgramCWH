package com.company;

import java.util.Collections;
import java.util.Vector;

public class Class89_CollectionsAndArrays_Part1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector();
        v.add(20);
        v.add(50);
        v.add(40);
        v.add(70);
        v.add(10);
        v.add(30);
//        System.out.println(v);                                           // Before --> [20, 50, 10, 30]
//        Collections.sort(v);
//        System.out.println(v);                                         // After --> [10, 20, 30, 50]

        //int x = Collections.binarySearch(v,30);
//        System.out.println(x);                                      // It is Work only after sorting otherwise return value is negative

//        Collections.swap(v,1,2);                                  // It is work both types sort and without sort

//        Collections.shuffle(v);                                    // It is always return default view

//        Collections.reverse(v);                                 // It is return reverse value of List

        System.out.println("Minimum Value in the List: "+Collections.min(v));                 // Return minimum value
        System.out.println("Maximum Value in the List: "+Collections.max(v));                 // Return maximum value
        System.out.println(v1);
    }
}
