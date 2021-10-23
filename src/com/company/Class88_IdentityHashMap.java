package com.company;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Class88_IdentityHashMap {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        m.put(i1,"Ramayana");
        m.put(i2,"Mahabharat");
        System.out.println("Normal HashMap : "+m);
        System.out.println("-----------------------------------------------------------");

        IdentityHashMap im = new IdentityHashMap();
        Integer t1 = new Integer(10);
        Integer t2 = new Integer(10);
        im.put(t1,"Ramayana");
        im.put(t2,"Mahabharat");
        System.out.println("IdentityHashMap : "+im);
    }
}
