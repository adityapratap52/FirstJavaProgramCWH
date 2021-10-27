package com.tambola;

import java.util.Arrays;
import java.util.Collections;

public class TambolaBoard {

    static String[] number_generator_arr;

    static public void tambolaBoard(){
        number_generator_arr = new String[90];

        for (int i = 0; i < number_generator_arr.length ; i++) {
            number_generator_arr[i] = (i+1)+"";
        }
        Collections.shuffle(Arrays.asList(number_generator_arr));
    }

    public static void main(String[] args) {

    }
}
