package com.tambola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Checker{

    static ArrayList <Integer>arrayList;
    static FileWriter fileWriter;
    static String[] number_generator_arr;

    public static void main(String[] args) {
        number_generator_arr = new String[90];

        for (int i = 1; i < number_generator_arr.length + 1; i++) {
            number_generator_arr[i - 1] = i+"";
        }
        Collections.shuffle(Arrays.asList(number_generator_arr));               // It is used for changing simple array values into random values
        TambolaTickets.genRanNoTicket();                                        // This is change random number of TambolaTickets

        try {
            int in;
            System.out.println();
            arrayList = new ArrayList<>();
            fileWriter = new FileWriter("C:\\Users\\Jadon\\IdeaProjects\\FirstJavaProgramCWH\\src\\com\\tambola\\StoreRanNo.txt");
            int i=0;
            int count = 1;
            while (number_generator_arr[i] != null){
                in= Integer.parseInt(number_generator_arr[i]);
                arrayList.add(in);
                fileWriter.write(in+"\n");
                Thread.sleep(500);
                System.out.println(in);
                if (TambolaTickets.hashSet.contains(in)){
                    System.out.println(in+" is stored in Ticket");
                    count++;
                    if (count == 15){
                        System.out.println("\n Housie! Congratulation you won the match \n");
                        break;
                    }
                }
                i++;
                System.out.println("===============================================================");;
            }
            int n = 1;
            System.out.println("\n**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Total Number Store in TambolaTable*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**");
            for (Integer integer : arrayList) {
                System.out.print(integer + ", ");
                if (n % 40 == 0) {
                    System.out.println();
                }
                n++;
            }
        }catch (IOException | InterruptedException e){
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
