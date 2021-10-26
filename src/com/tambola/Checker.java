package com.tambola;

import java.io.BufferedReader;
import java.io.FileReader;

public class Checker{
    static FileReader fr;

    public static void main(String[] args) {

        new TambolaBoard().genRanNoBoard();                 // This is change random number of StoreRanNo
        TambolaTickets.genRanNoTicket();                     // This is change random number of TambolaTickets

        try {
            fr = new FileReader("C:\\Users\\Jadon\\IdeaProjects\\FirstJavaProgramCWH\\src\\com\\tambola\\StoreRanNo.txt");
            int in;
            BufferedReader reader = new BufferedReader(fr);
            String line = null;
            System.out.println();
            while ((line = reader.readLine()) !=null){
                in= Integer.parseInt(line);
//                Thread.sleep(1000);
                if (TambolaTickets.h.contains(in)){
                    System.out.println(in+" is stored in Ticket");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
    }
}
