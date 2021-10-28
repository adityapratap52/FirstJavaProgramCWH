package com.tambola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Checker implements Runnable{

    static FileWriter board;

    public static boolean checker(HashSet<Integer>ticket1,HashSet<Integer>ticket2) {
        try {
            int boardValue;
            System.out.println();
            TambolaBoard.allBoardValues = new ArrayList<>();
            board = new FileWriter("C:\\Users\\Jadon\\IdeaProjects\\FirstJavaProgramCWH\\src\\com\\tambola\\StoreRanNo.txt");
            int i = 0;
            //-----------------------------------------------------
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to User interaction : y/n");
            String ans = sc.nextLine();

            if (ans.equals("y") || ans.equals("Y")) {
                int count1 = 1;
                int count2 = 1;
                String enterkey;
                System.out.println();
                do {
                    enterkey = sc.nextLine();
                    if (!enterkey.equals("")) {
                        System.err.println("\nYou didn't press the right key! Please Restart the game");
                        break;
                    }
                    boardValue = Integer.parseInt(TambolaBoard.number_generator_arr[i]);
                    TambolaBoard.allBoardValues.add(boardValue);
                    System.out.println(boardValue);
                    if (ticket1.contains(boardValue)) {
                        System.out.println(boardValue + " is stored in Ticket1");
                        if (count1 == 15) {
                            System.out.println("\n Housie!  Congratulation Player1 you won the match \n");
                            break;
                        }
                        count1++;
                    }
                    if (ticket2.contains(boardValue)) {
                        System.out.println(boardValue + " is stored in Ticket2");
                        if (count2 == 15) {
                            System.out.println("\n Housie! Congratulation Player2 you won the match \n");
                            break;
                        }
                        count2++;
                    }
                    i++;
                    System.out.println("===============================================================");
                } while (i != 90);
            } else if (ans.equals("n") || ans.equals("N")) {
                int count1 = 1;
                int count2 = 1;
                while (i != 90) {
                    boardValue = Integer.parseInt(TambolaBoard.number_generator_arr[i]);
                    TambolaBoard.allBoardValues.add(boardValue);
                    Thread.sleep(100);
                    System.out.println(boardValue);
                    if (ticket1.contains(boardValue)) {
                        System.out.println(boardValue + " is stored in Ticket1");
                        if (count1 == 15) {
                            System.out.println("\n Housie!  Congratulation Player1 you won the match \n");
                            break;
                        }
                        count1++;
                    }
                    if (ticket2.contains(boardValue)) {
                        System.out.println(boardValue + " is stored in Ticket2");
                        if (count2 == 15) {
                            System.out.println("\n Housie! Congratulation Player2 you won the match \n");
                            break;
                        }
                        count2++;
                    }
                    i++;
                    System.out.println("===============================================================");
                }
            } else if (ans.equals("")){
                System.err.println("You can't use Enter key at this time! Please Restart the game");
            }else {
                System.out.println("You entered wrong key");
            }
            board.write(TambolaBoard.allBoardValues + "\n");
            TambolaBoard.showBoardValues();

            System.out.print("\n ---------Player1 Ticket--------"+"\n | ");
            TambolaTickets.showTicket(Dealer.ticket1);
            System.out.print(" ---------Player2 Ticket--------"+"\n | ");
            TambolaTickets.showTicket(Dealer.ticket2);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                board.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return true;
    }
    public void run(){
        checker(Dealer.ticket1,Dealer.ticket2);
    }
}