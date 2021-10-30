package com.tambola;

import java.util.Arrays;
import java.util.Collections;

public class TambolaBoard {

    static String[] storeRandomNumber;

    static public void randomNoGenerator(){
        storeRandomNumber = new String[90];

        for (int i = 0; i < storeRandomNumber.length ; i++) {
            storeRandomNumber[i] = (i+1)+"";
        }
        Collections.shuffle(Arrays.asList(storeRandomNumber));
    }

    static public void showStoreValues(){
        int number = 1;
        System.out.println("\n\n**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Total Number Store in TambolaTable*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**\n");
        for (Integer integer : Dealer.allBoardValues) {
            System.out.print(integer + ", ");
            if (number % 40 == 0) {
                System.out.println();
            }
            number++;
        }
    }
}
