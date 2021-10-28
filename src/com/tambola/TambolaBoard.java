package com.tambola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TambolaBoard {

    static String[] number_generator_arr;
    static ArrayList<Integer> allBoardValues;

    static public void ranNoStore(){
        number_generator_arr = new String[90];

        for (int i = 0; i < number_generator_arr.length ; i++) {
            number_generator_arr[i] = (i+1)+"";
        }
        Collections.shuffle(Arrays.asList(number_generator_arr));
    }

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
}
