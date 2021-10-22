package com.company;

/*
  if n = 4 then

 & & & &
 &     &
 &     &
 & & & &

 */

public class Class18_LoopExp {
    public static void main(String[] args) {
        int n = 15;
        for (int i=1;i<=n;i++){
            System.out.print("$ ");
        }
        //---------------------------------------------
        System.out.println();
        for (int j=1;j<=n-2;j++){
            for (int i=1;i<=n;i++){
                if (i==1 || i==n){
                    System.out.print("& ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //---------------------------------------------
        for(int i=1;i<=n;i++){
            System.out.print("$ ");
        }
    }
}
