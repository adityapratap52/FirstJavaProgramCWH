package com.tambola;

import java.util.HashSet;
import java.util.Iterator;

public class TambolaTickets{

    static HashSet<Integer> h;
    int min = 1, max = 90;
    int  in;

    public void ranTicket(){
        h = new HashSet<>();
        for (int i=0; h.size() != 15; i++){
            in =(int)(Math.random() * (max - min + 1) + min);
            h.add(in);
        }
        Iterator it = h.iterator();
        int count = 1;
        while (it.hasNext()){
            int i = (int)it.next();
            System.out.printf("%3d  |",i);
            if (count%5 == 0) System.out.println();
            count++;
        }
//        return (0);
    }

    public static void main(String[] args) {
//        h = new HashSet<>();
//        TambolaTickets t = new TambolaTickets();
//        t.ranTicket();
    }
}

//  |*| Using Simple Array

//public class TambolaTickets {
//    public static void main(String[] args) {
////        RanTambolaTick rtt = new RanTambolaTick();
//        int min = 1, max = 15;
//        int i = 0;
//        boolean b;
//        int[] arr = new int[15];
//        while (i < 15) {
//            arr[i] = (int) (Math.random() * (max - min + 1) + min);
//            b = false;
//            for (int j = 0; j < i; j++) {
//                if (arr[j] == arr[i]) {
//                    b = true;
//                }
//            }
//            if (!b) {
//                i++;
//            }
//        }
//        System.out.println("\t   Ticket Of TAMBOLA");
//        System.out.print(" |-----------------------------|" + "\n" + " |");
//        for (int j = 1; j <= 15; j++) {
////            System.out.print(arr[j-1]+"  | ");
//            System.out.format("%3d  |", arr[j - 1]);                           // 3d means 3 digit right aligning
//            if (j % 5 == 0) System.out.println();
//            if (j % 15 == 0) System.out.println(" |-----------------------------|");
//            if (j % 5 == 0 && j < 15) System.out.print(" |");
//        }
//
//    }
//}

