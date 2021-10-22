package com.company;

public class Class6_Unary_Operator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
////       For Unary Operation Exp - 1
//        System.out.println(x++);    // 10(11)
//        System.out.println(++x);    // 12
//        System.out.println(x--);    // 12(11)
//        System.out.println(--x);    //10

////        Exp - 2
//        System.out.println(x++ + ++x);     // 10 + 12 = 22
//        System.out.println(y++ + y++);      // 10 + 11 = 21

//        Exp - 3
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);
    }
}
