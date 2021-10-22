package com.company;

import java.util.Scanner;

public class Matrix_Multiplication {

            static int r1, c1, r2, c2;
            static int i,j,k;
            static int [][]mat =  new  int [10][10];
            static int [][]mat1 =  new  int [10][10];
            static int [][]result =  new  int [10][10];

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter Rows for First Matrix: ");
                r1 = sc.nextInt();
                System.out.print("Enter Columns for First Matrix: ");
                c1 = sc.nextInt();
                System.out.print("Enter Rows for Second Matrix: ");
                r2 = sc.nextInt();
                System.out.print("Enter Columns for Second Matrix: ");
                c2 = sc.nextInt();

                if (c1 == r2)
                {
                    input_Mat();
                    display_Mat();
                    multiply_Mat();
                }
                else
                {
                    System.err.println("Your Input is not Correct So again input the Number");
                }
            }

            static void input_Mat()
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("\nEnter Value for First Matrix: ");
                for (i = 0; i < r1; i++)
                {
                    for (j = 0; j < c1; j++)
                    {
                        mat[i][j] = sc.nextInt();
                    }
                }
                System.out.println("\nEnter Value for Second Matrix: ");
                for (i = 0; i < r2; i++)
                {
                    for ( j = 0; j < c2; j++)
                    {
                        mat1[i][j] = sc.nextInt();
                    }
                }
            }

            static void display_Mat()
            {
                System.out.println("\nYour First Matrix: ");
                for (i = 0; i < r1; i++)
                {
                    for (j = 0; j < c1; j++)
                    {
                        System.out.print(mat[i][j] + "\t");
                    }
                    System.out.print("\n");
                }

                System.out.println("\nYour Second Matrix: ");
                for (i = 0; i < r2; i++)
                {
                    for (j = 0; j < c2; j++)
                    {
                        System.out.print(mat1[i][j] + "\t");
                    }
                    System.out.print("\n");
                }
            }

            static void multiply_Mat()
            {
                for (i = 0; i < r1; i++)
                {
                    for (j = 0; j < c2; j++)
                    {
                        for (k = 0; k < c1; k++)
                        {
                            result[i][j] = result[i][j] + mat[i][k] * mat1[k][j];
                        }
                    }
                }
                System.out.println("\nResult of Multiplication Matrix: ");
                for (i = 0; i < r1; i++)
                {
                    for (j = 0; j < c2; j++)
                    {
                        System.out.print(result[i][j] + "\t");
                    }
                    System.out.print("\n");
                }
            }
        }