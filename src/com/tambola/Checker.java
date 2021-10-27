package com.tambola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Checker{

    static ArrayList <Integer>arrayList;
    static FileWriter fileWriter;
    static String[] number_generator_arr;

    static public void boardValues(){
        int n = 1;
        System.out.println("\n\n**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Total Number Store in TambolaTable*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**\n");
        for (Integer integer : arrayList) {
            System.out.print(integer + ", ");
            if (n % 40 == 0) {
                System.out.println();
            }
            n++;
        }
    }

    public static void main(String[] args) {
        number_generator_arr = new String[90];

        for (int i = 0; i < number_generator_arr.length ; i++) {
            number_generator_arr[i] = (i+1)+"";
        }
        Collections.shuffle(Arrays.asList(number_generator_arr));
        TambolaTickets.genRanNoTicket();

        try {
            int in;
            System.out.println();
            arrayList = new ArrayList<>();
            fileWriter = new FileWriter("C:\\Users\\Jadon\\IdeaProjects\\FirstJavaProgramCWH\\src\\com\\tambola\\StoreRanNo.txt");
            int i=0;
            int count = 1;
            //-----------------------------------------------------
            System.out.println("Do you want to User interaction : y/n");
            Scanner sc = new Scanner(System.in);
            String ans = sc.next();
            if (ans.equals("y") || ans.equals("Y")){
                Scanner readinput = new Scanner(System.in);
                String enterkey;
                enterkey = readinput.nextLine();

                while (enterkey.equals("") && i != 90){
                enterkey = readinput.nextLine();
                if (!enterkey.equals("")){
                    System.err.println("You didn't press the right key! Please Restart the game");
                    break;
                }
                    in= Integer.parseInt(number_generator_arr[i]);
                    arrayList.add(in);
                    fileWriter.write(in+"\n");
                    System.out.println(in);
                    if (TambolaTickets.hashSet.contains(in)){
                        System.out.println(in+" is stored in Ticket");
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
            else if (ans.equals("n") || ans.equals("N")){
                while (i != 90){
                    in= Integer.parseInt(number_generator_arr[i]);
                    arrayList.add(in);
                    fileWriter.write(in+"\n");
                Thread.sleep(5000);
                    System.out.println(in);
                    if (TambolaTickets.hashSet.contains(in)){
                        System.out.println(in+" is stored in Ticket");
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
                System.out.println("You have given wrong answer! Please Restart the game");
            }
            TambolaTickets.genRanNoTicket();
            Checker.boardValues();
        }catch (IOException | InterruptedException  e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            }catch (IOException e1){
                e1.printStackTrace();
            }
        }

    }
}
