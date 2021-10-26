package com.company;
//
//import java.util.HashSet;
//import java.util.Iterator;
//
//public class Player{
//    public static void main(String[] args) {
//        HashSet h = new HashSet();
//        int min = 1, max = 90;
//        int  in;
//        for (int i=0; h.size() != 15; i++){
//            in =(int)(Math.random() * (max - min + 1) + min);
//            h.add(in);
//
//        }
//        Iterator it = h.iterator();
//        int count = 1;
//        while (it.hasNext()){
//            int i = (int)it.next();
//            System.out.printf("%3d  |",i);
//            if (count%5 == 0) System.out.println();
//            count++;
//        }
//    }
//}