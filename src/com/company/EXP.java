package com.company;

import java.util.HashMap;
import java.util.Map;

public class EXP {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,"Ram");
        hashMap.put(8,"Shyam");
        hashMap.put(4,"Shyam");
        hashMap.put(7,"pavan");
        hashMap.put(3,"Tarun");
        hashMap.put(30,"Tarun");
        hashMap.put(4,"Shyam12");
        hashMap.put(13,"Tarun");
        hashMap.put(null,"Tarun");
        hashMap.put(03,"Tarun");
        hashMap.put("Aditya","MCA");
        hashMap.put("Prabhat","MCA");
        hashMap.put("Prateek","MBA");
//        System.out.println("Before removing : "+hashMap);
        hashMap.remove(new Integer(3));
//        System.out.println("After removing : "+hashMap);
//        System.out.println(hashMap.get(40));
//        System.out.println(hashMap.containsKey(4));
//        System.out.println(hashMap.containsValue(4));
//        System.out.println(hashMap.entrySet());
//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.values());
//        System.out.println(hashMap.isEmpty());
//        System.out.println(hashMap.putIfAbsent(5,"Ramayan"));
//        System.out.println(hashMap.size());
        System.out.println(hashMap);
//        Map <Integer,String>hashMap1 = new HashMap<Integer,String>();
//        hashMap1.put(12,"Ram");
//        hashMap1.put(13,"Ram");

//        hashMap1.put(14,"Ram");
//        hashMap1.put(15,"Ram");
//        for (Map.Entry mapElement : hashMap1.entrySet()) {
//            int key = (int)mapElement.getKey();
//            String value = (String)mapElement.getValue();
//            System.out.println(key+" "+value);
//        }
    }
}