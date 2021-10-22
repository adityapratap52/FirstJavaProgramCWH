package com.company;

public class Class23_Copy_Array {
    public static void main(String[] args) {
//        char arr[] = {'a','d','i','t','y','a'};
//        char arr1[] = new char[6];
//        // Copy One Array to Another Array
//        System.arraycopy(arr,1,arr1,0,5);
//
//        // Display Another Array when Value is copy to this Array
//        System.out.println(String.valueOf(arr1));

//                        -------------OR------------------

        // Copy one array to another array
        char arr[] = {'A','d','i','t','y','a'};
        char arr1[] = new char[34];
        for (int i = 0; i < arr.length; i++)
        {
            arr1[i] = arr[i];
        }
        System.out.print("Values of Orginal Array: \n");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"");
        }
        System.out.print("\nValues of Copy Array: \n");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr1[i]+"");
        }
    }
}
