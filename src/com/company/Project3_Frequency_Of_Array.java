package com.company;

public class Project3_Frequency_Of_Array {
    public static void main(String[] args) {

        // Frequency of each element in array
        int arr[] = {1,3,5,1,6,2,3,3,5,8};
        int fr[] = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++)
        {
            int count = 1;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
            {
                fr[i] = count;
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("Element | Frequency");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < arr.length; i++)
        {
            if (fr[i] != visited)
            {
                System.out.println("  "+arr[i]+"     |     "+fr[i]);
            }
        }
    }
}
