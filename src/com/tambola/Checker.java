package com.tambola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Checker implements Runnable{

    static FileWriter store_RanNo_In_File;
    static int i;
    static int count1;
    static int count2;
    static String ans;

    static boolean comparing(HashSet<Integer>ticket1,HashSet<Integer>ticket2){

        int boardValue;

        boardValue = Integer.parseInt(Dealer.number_generator_arr[i]);
        Dealer.allBoardValues.add(boardValue);

        if (ans.equals("n") || ans.equals("N")){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(boardValue);
        if (ticket1.contains(boardValue)) {
            System.out.println(boardValue + " is stored in Ticket1");
            if (count1 == 15) {
                System.out.println("\n Housie!  Congratulation Player1 you won the match \n");
                return false;
            }
            count1++;
        }
        if (ticket2.contains(boardValue)) {
            System.out.println(boardValue + " is stored in Ticket2");
            if (count2 == 15) {
                System.out.println("\n Housie! Congratulation Player2 you won the match \n");
                return false;
            }
            count2++;
        }
        return true;
    }

    public static boolean checker() {
        try {
            boolean output_After_Comparing = true;
            count1 = 1;
            count2 = 1;
            i = 0;
            Dealer.allBoardValues = new ArrayList<>();
            store_RanNo_In_File = new FileWriter("C:\\Users\\Jadon\\IdeaProjects\\FirstJavaProgramCWH\\src\\com\\tambola\\StoreRanNo.txt");

            System.out.println();
            //-----------------------------------------------------
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to User interaction : y/n");
            ans = sc.nextLine();

            switch (ans) {
                case "y":
                case "Y":

                    String enterkey;
                    do {
                        enterkey = sc.nextLine();
                        if (!enterkey.equals("")) {
                            System.err.println("\nYou can't press the other keywords! Please Restart the game");
                            System.exit(0);
                        }
                        output_After_Comparing = comparing(Dealer.ticket1, Dealer.ticket2);
                        i++;
                        System.out.println("===============================================================");
                    } while (i != 90 && output_After_Comparing);
                    break;

                case "n":
                case "N":
                    while (i != 90 && output_After_Comparing) {
                        output_After_Comparing = comparing(Dealer.ticket1, Dealer.ticket2);
                        i++;
                        System.out.println("===============================================================");
                    }
                    break;

                case "":
                    System.err.println("You can't use Enter key at this time! Please Restart the game");
                    System.exit(0);

                default:
                    System.err.println("You entered wrong key");
                    System.exit(0);
            }
            store_RanNo_In_File.write(Dealer.allBoardValues + "\n");
            TambolaBoard.showBoardValues();

            System.out.print("\n ---------Player1 Ticket--------"+"\n | ");
            TambolaTickets.showTicket(Dealer.ticket1);
            System.out.print(" ---------Player2 Ticket--------"+"\n | ");
            TambolaTickets.showTicket(Dealer.ticket2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                store_RanNo_In_File.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return true;
    }
    public void run(){
        checker();
    }
}