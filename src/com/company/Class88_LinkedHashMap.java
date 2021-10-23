package com.company;

import javafx.scene.effect.SepiaTone;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Class88_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap m = new LinkedHashMap();  // It stores value from insertion order
        m.put(1,"Ramayan");
        m.put(4,"Mahabharat");
        m.put(3,"Geeta");
        Set s = m.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.println("Id : "+me.getKey()+"\n"+"Name : "+me.getValue());
            System.out.println("-----------------------------------------------");
        }
    }
}
