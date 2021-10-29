package com.tambola;

import java.util.Arrays;
import java.util.Collections;

public class TambolaBoard {

    static public void ranNoStore(){
        Dealer.number_generator_arr = new String[90];

        for (int i = 0; i < Dealer.number_generator_arr.length ; i++) {
            Dealer.number_generator_arr[i] = (i+1)+"";
        }
        Collections.shuffle(Arrays.asList(Dealer.number_generator_arr));
    }

    static public void showBoardValues(){
        int n = 1;
        System.out.println("\n\n**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Total Number Store in TambolaTable*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**\n");
        for (Integer integer : Dealer.allBoardValues) {
            System.out.print(integer + ", ");
            if (n % 40 == 0) {
                System.out.println();
            }
            n++;
        }
    }
}
