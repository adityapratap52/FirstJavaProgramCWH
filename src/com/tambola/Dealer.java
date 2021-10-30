package com.tambola;

import java.util.ArrayList;
import java.util.HashSet;

public class Dealer implements Runnable{
    static HashSet<Integer> ticket1 = new HashSet<>();
    static HashSet<Integer> ticket2 = new HashSet<>();
    static ArrayList<Integer> allBoardValues;

    public void run(){
        Player player = new Player();
        player.setTicket1(Player.generateTicket());             // Generate Ticket 1
        player.setTicket2(Player.generateTicket());             // Generate Ticket 2
        TambolaBoard.randomNoGenerator();                                             // Generate RandNo

        System.out.print(" ---------Player1 Ticket--------"+"\n | ");
        Player.showTicket(ticket1);
        System.out.print(" ---------Player2 Ticket--------"+"\n | ");
        Player.showTicket(ticket2);
    }
}
