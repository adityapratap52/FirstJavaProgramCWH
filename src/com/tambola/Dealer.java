package com.tambola;

import java.util.HashSet;

public class Dealer implements Runnable{
    static HashSet<Integer> ticket1 = new HashSet<>();
    static HashSet<Integer> ticket2 = new HashSet<>();

    public void run(){
        TambolaTickets tambolaTickets = new TambolaTickets();
        tambolaTickets.setTicket1(TambolaTickets.genRanNoTicket());             // Generate Ticket 1
        tambolaTickets.setTicket2(TambolaTickets.genRanNoTicket());             // Generate Ticket 2
        TambolaBoard.ranNoStore();                                             // Generate RandNo

        System.out.print(" ---------Player1 Ticket--------"+"\n | ");
        TambolaTickets.showTicket(ticket1);
        System.out.print(" ---------Player2 Ticket--------"+"\n | ");
        TambolaTickets.showTicket(ticket2);
    }
}
