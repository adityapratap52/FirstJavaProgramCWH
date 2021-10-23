package com.company;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp{
    public String toString(){
        return "temp";
    }
    public void finalize(){
        System.out.println("Finalize mathod has Come!");
    }
}

public class Class88_WeakHashMap {
    public static void main(String[] args) throws Exception{
        HashMap hm = new HashMap();
        Temp temp = new Temp();
//        hm.put(temp,"Ramayan");
//        System.out.println(hm);
//        temp = null;
//        System.gc();
//        Thread.sleep(5000);
//        System.out.println(hm);

        WeakHashMap wm = new WeakHashMap();
        wm.put(temp,"Ramayan");
        System.out.println(wm);
        temp = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(wm);
    }
}
