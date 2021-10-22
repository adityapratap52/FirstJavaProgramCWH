package com.company;

import java.util.HashMap;
import java.util.Map;

public class Class88_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new HashMap();

        m1.put(null,null);
        m1.put(6,null);
        m1.put(null,"Anas");        // not come one more null keys but it is always override
        m1.put(21,"Aditya");
        m1.put(7,null);             // always come one more null value bcz keys is always different if no different then override
        m2.put(21,"Aditya Pratap");
        m1.put(33,"Prabhat");            // Duplicate data is not work
        m1.put(2,"Prateek");            // keys will not sorted
        m2.put(1,"Hiii");
        m2.put(12,"Byy");
        m2.put(13,"Jaay");
        m1.putAll(m2);
        m1.replace(33,"Prabhat","Prashant");            // For replacing value
        System.out.println("Entry Set: "+m1.entrySet());
        System.out.println("Keys Set: "+m1.keySet());                // Only shows keys
        System.out.println("Values Set: "+m1.values());                // Only shows values
        System.out.println("Is 3 no key is Present: "+m1.containsKey(3));    // It is check that 3 no key is present in this Map if present then return true otherwise false
        System.out.println("Is Prabhat value is Present: "+m1.containsValue("Prabhat"));    // It is check that Prabhat value is present in this Map if present then return true otherwise false
        System.out.println(m1.merge(11,"Hiiiiiii",Object::equals));
        System.out.println("Entry Set: "+m1);
    }
}
