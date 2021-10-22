package com.company;
import java.util.Scanner;
public class Class22_Jagged_Array {
    public static void main(String[] args) {
//        int [][]arr = {{1,2,3},{6,7,8,9,5},{1,2}};
        int arr[][] = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[6];
        arr[2] = new int[2];
        System.out.println("Enter Values for Jagged Array: ");
        Scanner sc = new Scanner(System.in);

        //Initialize the data for jagged array
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }

    }

//Printing the data of Jagged Array
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");}
            System.out.println();
        }
    }
}
