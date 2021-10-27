package com.tambola;

import java.util.HashSet;
import java.util.Iterator;

public class TambolaTickets{

    static HashSet<Integer> TicketValues = new HashSet<>();
    static int min = 1, max = 90;

    // Method of generate ticket number
    static public void genRanNoTicket(){
        while (TicketValues.size() != 15) {
            int value =(int)(Math.random() * (max - min + 1) + min);
            TicketValues.add(value);
        }
        Iterator<Integer> it = TicketValues.iterator();
        int count = 1;
        System.out.print(" -----------Your Ticket----------"+"\n | ");
        while (it.hasNext()){
            int tickValue = it.next();
            System.out.printf("%3d  |",tickValue);
            if (count%5 == 0) System.out.println();
            if(count%5 == 0 && count != 15) System.out.print(" | ");
            count++;
        }
        System.out.println(" --------------------------------");
    }

    public static void main(String[] args) {
        TambolaTickets.genRanNoTicket();
//        TambolaTickets.genRanNoTicket();
    }
}

