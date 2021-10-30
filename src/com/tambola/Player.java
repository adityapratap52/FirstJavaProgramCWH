package com.tambola;

import java.util.HashSet;
import java.util.Iterator;

public class Player{

    static int min = 1, max = 90;

    public void setTicket1(HashSet<Integer>ticket){
        Dealer.ticket1 = ticket;
    }
    public void setTicket2(HashSet<Integer>ticket){
        Dealer.ticket2 = ticket;
    }

    // Method of generate ticket number
    static public HashSet<Integer> generateTicket(){
        HashSet<Integer> ticket = new HashSet<>();
        while (ticket.size() != 15 ) {
            int value =(int)(Math.random() * (max - min + 1) + min);
            ticket.add(value);
        }
        return ticket;
    }

    static public void showTicket(HashSet<Integer> ticket){
        Iterator<Integer> iterateToTicket = ticket.iterator();
        int ticketCount = 1;
        while (iterateToTicket.hasNext()){
            int ticketValue = iterateToTicket.next();
            System.out.printf("%3d  |",ticketValue);
            if (ticketCount%5 == 0) System.out.println();
            if(ticketCount%5 == 0 && ticketCount != 15) System.out.print(" | ");
            ticketCount++;
        }
        System.out.println(" --------------------------------");
    }
}

