package com.company;

public class Class67_WrapperClass {
    public static void main(String[] args) {
        //------Use valueOf()----------(It is static)
        //Integer i1 = Integer.valueOf("12");
        //Integer i2 = Integer.valueOf("010011",2);
        //Float f1 = Float.valueOf("12.5");
        //System.out.println(i1);
        //System.out.println(i2);
        //System.out.println(f1);

        //---------Use parseXxx--------(It is static)
        //Integer i1 = Integer.parseInt("123");
        //double d2 = Double.parseDouble("12.56");
        //System.out.println(i1);
        //System.out.println(d2);

        //---------Use XxxValue--------(It is non-static)
        Integer i2 = Integer.valueOf("010011",2);
        Integer i1 = Integer.parseInt("010011",2);
        int c = i1.intValue();
        int c1 = i2.intValue();
        System.out.println(c);
        System.out.println(c1);
    }
}
