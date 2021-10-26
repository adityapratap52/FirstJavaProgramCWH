package com.tambola;

import java.util.HashSet;
import java.util.Iterator;

public class TambolaTickets{

    static HashSet<Integer> h;
    static int min = 1, max = 90;
    static int  in;

    static public void genRanNoTicket(){
        h = new HashSet<>();
        while (h.size() != 15) {
            in =(int)(Math.random() * (max - min + 1) + min);
            h.add(in);
        }
        Iterator<Integer> it = h.iterator();
        int count = 1;
        while (it.hasNext()){
            int i = it.next();
            System.out.printf("%3d  |",i);
            if (count%5 == 0) System.out.println();
            count++;
        }
    }

    public static void main(String[] args) {
    }
}

