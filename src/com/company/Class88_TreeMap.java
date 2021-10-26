package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.SortedSet;
import java.util.TreeMap;

public class Class88_TreeMap {
    public static void main(String[] args) {
        TreeMap ss = new TreeMap();
//        ss.put(null,"Arun");                  // It is throw nullPointerException
        ss.put(1,"Raama");
        ss.put(5,null);
        ss.put(4,"Rahim");
        ss.put(3,4000);
        System.out.println(ss);
    }
}
