package com.company;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Class86_TreeSet_SortedSet_NaviSet_Part1 {

    public static void main(String[] args) {
//        SortedSet st = new TreeSet();         // Comparable interface is Predefine for Wrapper class
//        st.add(2);
//        st.add(3);
//        st.add(4);
//        //st.add("Ram");   //No use of null and different data type
//        st.add(1);
//        st.add(0);
//        System.out.println(st);
//        System.out.println("First Value: "+st.first());
//        System.out.println("Last Value: "+st.last());
//        System.out.println("Lower values of 2: "+st.headSet(2));        // Less values than 2
//        System.out.println("Upper values of 2: "+st.tailSet(2));        // greater and equal values then 2
//        System.out.println(st.comparator());                            // if order is default natural then gives null
//        System.out.println("Values between 2 and 4: "+st.subSet(2,4));   // 2 include and 4 exclude

//------------------------------------------------------------------------------------------------------
        NavigableSet ns = new TreeSet();
        ns.add(0);
        ns.add(3);
        ns.add(5);
        ns.add(8);
        ns.add(10);
        ns.add(12);
        ns.add(6);
        // Reverse(descending) order of Values
        NavigableSet revNs = ns.descendingSet();         // generalize is optional
        System.out.println("Ascending Order: " +ns);
        System.out.println("Reverse Order: "+revNs);

        NavigableSet threeOrMore = ns.tailSet(3,true);      // true means include to 3 + rest values--> [3,4,5,6]
        System.out.println("3 or more values: "+threeOrMore);
        System.out.println("Lower Value of 3: "+ns.lower(3));               // gives lower value of 3 = 0
        System.out.println("Floor(2): "+ns.floor(2));                       // gives lower or equal value of 2 = 0
        System.out.println("Higher Value of 3: "+ns.higher(3));             // gives higher value of 3 = 5
        System.out.println("Ceiling(2): "+ns.ceiling(2));                   // gives higher or equal value of 2 = 5
        System.out.println("Navigable Set: "+ns);
        System.out.println("Poll First: "+ns.pollFirst());                      // Remove and print lowest value of Set
        System.out.println("Navigable Set: "+ns);
        System.out.println("Poll Last: "+ns.pollLast());                        // Remove and print highest value of Set
        System.out.println("Navigable Set: "+ns);
        System.out.println("Poll First: "+ns.pollFirst());
        System.out.println("Navigable Set: "+ns);
        System.out.println("Poll First: "+ns.pollFirst());
        System.out.println("Navigable Set: "+ns);
        System.out.println("Poll First: "+ns.pollFirst());
        System.out.println("Navigable Set: "+ns);
        System.out.println("Poll First: "+ns.pollFirst());
        System.out.println("Poll Last: "+ns.pollLast());
        System.out.println("Navigable Set: "+ns);
//----------------------------------------------------------------------------------------------------------------------
//        NavigableSet<Float> ns = new TreeSet<>();
//        ns.add(2.3f);
//        ns.add(5.7f);
//        ns.add(3.7f);
//        ns.add(7.9f);
//        System.out.println(ns);
//        System.out.println(ns.floor(2.2f));
//        System.out.println(ns.floor(3.6f));
//        System.out.println(ns.floor(3.7f));
//        System.out.println(ns.floor(3.8f));
//        System.out.println(ns.ceiling(3.5f));
//        System.out.println(ns.ceiling(3.7f));
//        System.out.println(ns.ceiling(3.8f));
//        System.out.println(ns.ceiling(12.5f));  // it provide null value bcz it is highest value in this set
    }
}
