package com.company;

//import java.io.FileInputStream;
//import java.io.IOException;
import java.io.*;

public class Class70_ReadingUsing_FileInputStream{
    public static void main(String[] args) throws IOException {
        FileInputStream fins = new FileInputStream("D:/java/main2.txt");
        int i;
//        do {
//            i = fins.read();
//            if (i != -1)
//                System.out.print((char)i);      // use char for typecast bcz i is a int
//        }while (i != -1);
        //-------------------OR---------------------
        while((i = fins.read()) != -1){
            System.out.print((char)i);
        }
        fins.close();
    }
}
