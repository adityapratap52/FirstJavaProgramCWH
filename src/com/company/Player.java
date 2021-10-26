package com.company;


//  |*| Using Simple Array

public class Player {
    public static void main(String[] args) {
        int min = 1, max = 15;
        int i = 0;
        boolean b;
        int[] arr = new int[15];
        while (i < 15) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            b = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    b = true;
                }
            }
            if (!b) {
                i++;
            }
        }
        System.out.println("\t   Ticket Of TAMBOLA");
        System.out.print(" |-----------------------------|" + "\n" + " |");
        for (int j = 1; j <= 15; j++) {
//            System.out.print(arr[j-1]+"  | ");
            System.out.format("%3d  |", arr[j - 1]);                           // 3d means 3 digit right aligning
            if (j % 5 == 0) System.out.println();
            if (j % 15 == 0) System.out.println(" |-----------------------------|");
            if (j % 5 == 0 && j < 15) System.out.print(" |");
        }

    }
}
