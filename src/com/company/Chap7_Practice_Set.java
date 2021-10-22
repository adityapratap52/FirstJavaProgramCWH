package com.company;
import java.util.*;

public class Chap7_Practice_Set {

  // Question 1- Print n Number of table
//   static void table(int n)
//    {
//        for (int i=2; i<=n; i++)
//        {
//            for (int j=1; j<11; j++){
//
//                System.out.format("%d X %d = %d\n",i,j,i*j);
//            }
//            System.out.print("\n");
//        }
//    }

//    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many number , table print: ");
//        n = sc.nextInt();
//        table(n);
//    }

    // Question 2- Print stars
//        void printStar(int n)
//        {
//           for (int i=1; i<=n; i++)
//           {
//               for (int j=0; j<i; j++){
//                   System.out.print("* ");
//               }
//               System.out.println();
//           }
//        }

//        public static void main(String[] args) {
//            int n;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("How many Rows , You want to  print Stars: ");
//            n = sc.nextInt();
//            Chap7_Practice_Set obb = new Chap7_Practice_Set();
//            obb.printStar(n);

        // Question 3- Calculate sum of n natural numbers by recursive function
//        static int naturalNo(int n){
//            if (n == 1){
//                return 1;
//            }
//            else {
//                return n+ naturalNo(n-1);
//            }
//            }
//
//        public static void main(String[] args) {
//            int n;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("How many natural numbers you want to sum: ");
//            n = sc.nextInt();
//            System.out.format("Your %d natural no. sum is: %d",n, naturalNo(n));
//  }

    //Question 4- Print Reverse stars
//        void printStar(int n)
//        {
//           for (int i=0; i<=n; i++)
//           {
//               for (int j=n; j>i; j--){
//                   System.out.print("* ");
//               }
//               System.out.println();
//           }
//        }
//
//        public static void main(String[] args) {
//            int n;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("How many Rows , You want to  print reverse Stars: ");
//            n = sc.nextInt();
//            Chap7_Practice_Set obb = new Chap7_Practice_Set();
//            obb.printStar(n);
//        }

       // Question 5- Factorial by recursion
//        static int fact(int n){
//            if (n<=1)
//                return 1;
//            else
//                return n*(fact(n-1));
//        }
//
//        public static void main(String[] args) {
//            int n;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Factorial number yor want to sum: ");
//            n = sc.nextInt();
//            System.out.printf("Sum of %d factorial number is: %d",n,fact(n));
//        }

       // Question 6- Fibonacci Series by recursion
//        static int fib(int n) {
//            if (n > 0) {
//                if (n <= 2)
//                    return n - 1;
//                else
//                    return fib(n - 1) + fib(n - 2);
//            }
//            else {
//                System.out.println("Input is not Correct!");
//                return 0;
//            }
//        }
//
//        public static void main(String[] args) {
//            int n;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Fibonacci number yor want to print: ");
//            n = sc.nextInt();
//            System.out.println("Your fibonacci no is: "+fib(n));
//        }

        // Question 7- Average of Numbers
//        static float get_avg(int ... arr){
//            float avg_No;
//            float sum = 0;
//            for (int a: arr){
//                sum += a;
//            }
//            avg_No = sum/arr.length;
//            return avg_No;
//        }
//        public static void main(String[] args) {
//            System.out.println("Your average of number is: "+get_avg(1,2,3,4,5,6));
//
//        }

        // Question 8- Repeat 4 using recursion
//        static int count = 0;
//        static int rec() {
//            if (count == 8) {
//                return 0;
//            }
//            else {
//                count++;
//                System.out.println(4);
//                return rec();
//            }
//        }
//
//        public static void main(String[] args) {
//            rec();
//        }

        // Question 9- Convert Celsius temperature into fahrenheit
        static float temp_Convert(int n){
            float far;
            far = (n*9f/5f)+32;
            return far;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value for convert Celsius value into Fahrenheit: ");
            int n = sc.nextInt();
            System.out.println("Your Converting value is: "+temp_Convert(n));
        }

        // Question 10- Repeat 3 using iterative approach
//            static void iterative(){
//                for (int i=0; i<10; i++){
//                    if (i == 5){
//                        break;
//                    }
//                    System.out.println(3);
//                }
//            }
//
//            public static void main(String[] args) {
//                iterative();
//    }
}
