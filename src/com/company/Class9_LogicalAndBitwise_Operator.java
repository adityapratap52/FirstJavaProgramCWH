package com.company;

public class Class9_LogicalAndBitwise_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

//        // Logical && and Bitwise & operator
//        System.out.println(a < b && a<c);  // && check first condition if first is false otherwise both check
//        System.out.println(a < b & a<c);    // & always check both condition
//        System.out.println(a < b && a++ < c);
//        System.out.println(a);
//        System.out.println(a < b & a++ < c);
//        System.out.println(a);

        // Logical || and Bitwise | operator
        System.out.println(a < b || a < c);
        System.out.println(a < b | a < c);
        System.out.println(a < b || a++ < c);       //a++ = 10+1 = 11
        System.out.println(a);
        System.out.println(a < b | a++ < c);        //a++ = 11+1 = 12
        System.out.println(a);
    }

}
