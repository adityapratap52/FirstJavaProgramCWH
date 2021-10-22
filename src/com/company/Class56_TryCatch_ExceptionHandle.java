package com.company;

public class Class56_TryCatch_ExceptionHandle {
    public static void main(String[] args){
        String s1 = "123";
        String s = null;

        try {
            int a = Integer.parseInt(s1);
            try {
                System.out.println(s.length());
            }catch (NullPointerException e){
                System.out.println("NullPointerException Occurs");
            }
            try {
                int b = 10/0;
            }catch (ArithmeticException e){
                System.out.println("ArithmeticException Occurs");
            }
            System.out.println("Other Code...");
        }catch (Exception e){
            System.out.println("Parent Exception Occurs");
        }


//        try{
//            int []arr = new int [5];            // Only first Exception Occurs and the rest exception is not work
//            arr[14] = 10;
//            int x = Integer.parseInt(s1);
//            int a = 10/0;
//            System.out.println(s.length());
//        }
//
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException Occurs");
//        }
//
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException Occurs");
//        }
//        catch (NumberFormatException e){
//            System.out.println("NumberFormatException Occurs");
//        }
//        catch (NullPointerException e){
//            System.out.println("NullPointerException Occurs");
//        }
//        catch (Exception e){                                  // --> It is use always below of all Exception otherwise It throw compile time error
//            System.out.println("Parent Exception Occurs");
//        }
        System.out.println("Rest of the code....");
    }
}
