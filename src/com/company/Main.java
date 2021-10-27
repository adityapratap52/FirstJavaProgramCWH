package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner readinput = new Scanner(System.in);

        String enterkey = "Hola";
        System.out.print(enterkey);

        enterkey = readinput.nextLine();
        while(enterkey.equals("")){
            enterkey = readinput.nextLine();
            System.out.print(enterkey);

            if(!enterkey.equals("")) {
                break;
            }
        }
    }
}
