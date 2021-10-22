package com.company;

public class Class19_Array_Anonymous {
    static void print_array(int arr[])
    {
        for (int element: arr)
        {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        print_array(new int[]{1,2,3,4,5,6,7,8,9});

    }
}
