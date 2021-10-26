package com.tambola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class TambolaBoard{

    String[] number_generator_arr;
    FileWriter fr;

   public void genRanNoBoard() {
       number_generator_arr = new String[90];

       for (int i = 1; i < number_generator_arr.length + 1; i++) {
       number_generator_arr[i - 1] = i+"";
       }
        Collections.shuffle(Arrays.asList(number_generator_arr));
       try {
           fr = new FileWriter("C:\\Users\\Jadon\\IdeaProjects\\FirstJavaProgramCWH\\src\\com\\tambola\\StoreRanNo.txt");
       for(String num : number_generator_arr){
           fr.write(num+"\n");
       }
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           try {
               fr.close();
           }catch (IOException e){
               e.printStackTrace();
           }
       }
   }
    public static void main(String[] args) {
//        new TambolaBoard().compare12();
    }
}
