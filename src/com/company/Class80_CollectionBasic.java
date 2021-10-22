package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Class80_CollectionBasic {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();

        l1.add(2);
        l1.add("Mohan");
        l1.add("Shyam");
        l1.add(4);

        l2.add(21);
        l2.add(22);
        l2.add(23);

        l1.addAll(l2);
        //l1.retainAll(l1);
        Iterator it = l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
