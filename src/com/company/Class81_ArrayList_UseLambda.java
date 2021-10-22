package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Class81_ArrayList_UseLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(204);
        list.add(403);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(501);
        list.add(100);
        Comparator<Integer> com = (Integer o1, Integer o2) -> o1%10 > o2%10 ? 1 : -1;
               /* if (o1%10 > o2%10)
                    return 1;
                else
                    return -1;

                */
        list.sort(com);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}
