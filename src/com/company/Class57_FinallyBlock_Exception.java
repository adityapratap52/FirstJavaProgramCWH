package com.company;

public class Class57_FinallyBlock_Exception {
    public static void main(String[] args) {
        Class57_FinallyBlock_Exception n = new Class57_FinallyBlock_Exception();
        try{
            int []arr = new int [5];
//            System.exit(0);                 // If you use exit in this line then your rest program which is below to exit, is not work
            System.out.println(arr[7]);
//            System.exit(0);                 // If you use exit in this line then Exit will not work bcz Exception has already come before this line

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurs");
//            System.exit(0);             // If you use exit in this line then your rest program which is below to exit, is not work
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException Occurs");
        }catch (Exception e){
            System.out.println(e);
            System.exit(0);         // When Exception block is working
        }
        finally {
            System.out.println("It is always Work");
        }
        System.out.println("This is main");
    }
}