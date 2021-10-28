package com.tambola;

import java.util.HashSet;
import java.util.Iterator;

public class TambolaTickets{

    static int min = 1, max = 90;

    public void setTicket1(HashSet<Integer>ticket){
        Dealer.ticket1 = ticket;
    }
    public void setTicket2(HashSet<Integer>ticket){
        Dealer.ticket2 = ticket;
    }

    // Method of generate ticket number
    static public HashSet<Integer> genRanNoTicket(){
        HashSet<Integer> ticket = new HashSet<>();
        while (ticket.size() != 15 ) {
            int value =(int)(Math.random() * (max - min + 1) + min);
            ticket.add(value);
        }
        return ticket;
    }

    static public void showTicket(HashSet<Integer> ticket){
        Iterator<Integer> it = ticket.iterator();
        int count = 1;
        while (it.hasNext()){
            int tickValue = it.next();
            System.out.printf("%3d  |",tickValue);
            if (count%5 == 0) System.out.println();
            if(count%5 == 0 && count != 15) System.out.print(" | ");
            count++;
        }
        System.out.println(" --------------------------------");
    }
}

