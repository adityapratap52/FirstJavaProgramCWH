package com.company;

import java.util.Arrays;

public class Class89_CollectionsAndArrays_Part2 {
    public static void main(String[] args) {
//        int []arr = new int[]{4,5,2,6,1};
//------------------------------------------------------------------------------------------------------
//        for (int e : arr)
//        {System.out.print(e+", ");}
//        Arrays.sort(arr);
//        for (int e : arr)
//        {System.out.print(e+", ");}
//-------------------------------------------------------------------------------------------------------
//        Arrays.sort(arr,2,5);               // 2 include and 5 exclude
//        System.out.println("");
//        for (int e : arr)
//        {System.out.print(e+", ");}
//-------------------------------------------------------------------------------------------------------
//        int []arr = new int[4];
//        Arrays.fill(arr,14);                    // fill 14 in all places of arr
//        for (int e: arr)
//            System.out.println(e);
//-------------------------------------------------------------------------------------------------------
        int []arr = new int[]{3,5,1,8,9,12,34};
        Arrays.fill(arr,2,6,15);                    // fill 14 in only indexes places of arr
        for (int e: arr)
            System.out.print(e+" ");
    }
}
