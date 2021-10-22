package com.company;

public class Class10_Turnary_Operator {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int min = (a < b) ? a:b;
        System.out.println(min);
        int max = (a > b) ? a:b;
        System.out.println(max);
    }
}
