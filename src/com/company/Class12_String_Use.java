package com.company;

import java.util.Arrays;

public class Class12_String_Use {
    public static void main(String[] args) {
        String  name = new String("My Name is Aadi");
        String name1 = "My Name is Rohan";
        String name2 = "Rohan", name3 = "Amar" + " Kunj";
        name2 = name2.concat(" Tendulkar");         // not use name2.concat because value is not change to this format

        System.out.println(name);
        System.out.println(name1);
        System.out.printf("Hello Students! My name is %s",name2);
        System.out.format("\nHello Students! My name is %s",name2);
        System.out.printf("\nHello Students! My name is %s",name3);     //Always same name print because String is imortal
    }
}
