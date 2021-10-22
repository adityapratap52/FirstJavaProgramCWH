package com.company;
class MyException1 extends Exception{
    @Override
    public String toString() {
        return "Radius can not be negative";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"Radius can not be negative";
    }
}
public class Class59_Throw_Throws_Exception {
    public static double area(int r) throws MyException1{
        if (r<0){
                throw new  MyException1();
        }

        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a,int b){
        // Made by Adi
        int result = a/b;
        return result;
    }
    public static void main(String[] args) throws ArithmeticException{
        // Prabhat - Uses divide function created by Harry
        try {
            double ar = area(-12);
            System.out.println(ar);
//            System.out.println(divide(4,0));
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
