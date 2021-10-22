package com.company;

import java.util.ArrayList;

public class Class81_ArrayList_Collection {
    public static void main(String []args){
        ArrayList<Integer> l1 = new ArrayList<>();        //<Integer(generic)>is not compulsory it is use for store only integer value
        ArrayList<Integer> l2 = new ArrayList<>(9);         // Normally ArrayList is heterogeneous(store String, Integer both in one List)
        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(0,1);
        l1.add(2);

        //l1.addAll(l2);                                                   // It is same as---> l1.addAll(l1.size(),l2);
        l1.addAll(0,l2);
        //l1.clear();                                                     // Delete all values of l1

        System.out.println("Total Size of Array List: "+l1.size());
        //System.out.println("Is it Contain to 2: "+l1.contains(2));
        //System.out.println("Is it Empty or not: "+l1.isEmpty());
        //System.out.println("Value of index 2: "+l1.indexOf(2));             // We must be insert value not index value
        //System.out.println("Value of index 2: "+l1.lastIndexOf(2));

        //l1.remove(3);                                                // It is remove index 3 value = 1
        l1.set(1,34);                                                  //  It is change or replace value that is already located in the index

        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));                                  // not declare as (l1[i]) or you can use forEach loop
            System.out.print(", ");
        }
    }
}
