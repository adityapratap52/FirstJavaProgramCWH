package com.company;

public class Class20_Returning_Array {
    static int [] get()
    {
        return new int[]{2,4,6,8,10,12};
    }
    public static void main(String[] args) {
        int arr[] = get();
        for (int element: arr)
        {
            System.out.println(element);
        }
    }
}
