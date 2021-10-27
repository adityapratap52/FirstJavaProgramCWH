package com.tambola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Checker{

    static ArrayList <Integer>allBoardValues;
    static FileWriter board;


    static public void showBoardValues(){
        int n = 1;
        System.out.println("\n\n**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Total Number Store in TambolaTable*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**\n");
        for (Integer integer : allBoardValues) {
            System.out.print(integer + ", ");
            if (n % 40 == 0) {
                System.out.println();
            }
            n++;
        }
    }

    public static void main(String[] args) {

        TambolaTickets.genRanNoTicket();

        try {
            int boardValue;
            System.out.println();
            allBoardValues = new ArrayList<>();
            board = new FileWriter("C:\\Users\\Jadon\\IdeaProjects\\FirstJavaProgramCWH\\src\\com\\tambola\\StoreRanNo.txt");
            int i=0;
            int count = 1;
            //-----------------------------------------------------
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to User interaction : y/n");
            String ans = sc.next();
            TambolaBoard.tambolaBoard();
            if (ans.equals("y") || ans.equals("Y")){
                String enterkey;
                System.out.println();
                do{
                    enterkey = sc.nextLine();
                    if (!enterkey.equals("")){
                        System.err.println("You didn't press the right key! Please Restart the game");
                        break;
                    }
                    boardValue= Integer.parseInt(TambolaBoard.number_generator_arr[i]);
                    allBoardValues.add(boardValue);
                    board.write(boardValue+"\n");
                    System.out.println(boardValue);
                    if (TambolaTickets.TicketValues.contains(boardValue)){
                        System.out.println(boardValue+" is stored in Ticket");
                        if (count == 15){
                            System.out.println("\n Housie! Congratulation you won the match \n");
                            break;
                        }
                        count++;
                    }
                    i++;
                    System.out.println("===============================================================");
                }while (enterkey.equals("") && i != 90);
            }
            else if (ans.equals("n") || ans.equals("N")){
                while (i != 90){
                    boardValue= Integer.parseInt(TambolaBoard.number_generator_arr[i]);
                    allBoardValues.add(boardValue);
                    board.write(boardValue+"\n");
                Thread.sleep(100);
                    System.out.println(boardValue);
                    if (TambolaTickets.TicketValues.contains(boardValue)){
                        System.out.println(boardValue+" is stored in Ticket");
                        if (count == 15){
                            System.out.println("\n Housie! Congratulation you won the match \n");
                            break;
                        }
                        count++;
                    }
                    i++;
                    System.out.println("===============================================================");
                }
            }
            else {
                System.err.println("You have given wrong answer! Please Restart the game");
            }
            TambolaTickets.genRanNoTicket();
            Checker.showBoardValues();
        }catch (IOException | InterruptedException  e){
            e.printStackTrace();
        }finally {
            try {
                board.close();
            }catch (IOException e1){
                e1.printStackTrace();
            }
        }
    }
}