package com.tambola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Checker implements Runnable{

    static FileWriter storeInFile;
    static int loopCycle;
    static int countPlayer1;
    static int countPlayer2;
    static String userAnswer;

    static boolean comparing(HashSet<Integer>ticket1,HashSet<Integer>ticket2){

        int boardValue;

        boardValue = Integer.parseInt(TambolaBoard.storeRandomNumber[loopCycle]);
        Dealer.allBoardValues.add(boardValue);

        if (userAnswer.equals("n") || userAnswer.equals("N")){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(boardValue);
        if (ticket1.contains(boardValue)) {
            System.out.println(boardValue + " is stored in Ticket1");
            if (countPlayer1 == 15) {
                System.out.println("\n Housie!  Congratulation Player1 you won the match \n");
                return false;
            }
            countPlayer1++;
        }
        if (ticket2.contains(boardValue)) {
            System.out.println(boardValue + " is stored in Ticket2");
            if (countPlayer1 == 15) {
                System.out.println("\n Housie! Congratulation Player2 you won the match \n");
                return false;
            }
            countPlayer2++;
        }
        return true;
    }

    public static void checker() {
        try {
            boolean outputAfterComparing = true;
            countPlayer1 = 1;
            countPlayer2 = 1;
            loopCycle = 0;
            Dealer.allBoardValues = new ArrayList<>();
            storeInFile = new FileWriter("C:\\Users\\Jadon\\IdeaProjects\\FirstJavaProgramCWH\\src\\com\\tambola\\StoreRandomNumber.txt");

            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to User interaction : y/n");
            userAnswer = sc.nextLine();

            switch (userAnswer) {
                case "y":
                case "Y":

                    String enterKey;
                    do {
                        enterKey = sc.nextLine();
                        if (!enterKey.equals("")) {
                            System.err.println("\nYou can't press the other keywords! Please Restart the game");
                            System.exit(0);
                        }
                        outputAfterComparing = comparing(Dealer.ticket1, Dealer.ticket2);
                        loopCycle++;
                        System.out.println("===============================================================");
                    } while (loopCycle != 90 && outputAfterComparing);
                    break;

                case "n":
                case "N":
                    while (loopCycle != 90 && outputAfterComparing) {
                        outputAfterComparing = comparing(Dealer.ticket1, Dealer.ticket2);
                        loopCycle++;
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
            storeInFile.write(Dealer.allBoardValues + "\n");
            TambolaBoard.showStoreValues();

            System.out.print("\n ---------Player1 Ticket--------"+"\n | ");
            Player.showTicket(Dealer.ticket1);
            System.out.print(" ---------Player2 Ticket--------"+"\n | ");
            Player.showTicket(Dealer.ticket2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                storeInFile.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    public void run(){
        checker();
    }
}