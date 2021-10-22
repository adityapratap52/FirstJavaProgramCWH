package com.company;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.SequenceInputStream;
//import java.io.IOException;
import java.io.*;

public class Class73_SequenceInputStream1 {
    public static void main(String []args) throws IOException{
        FileInputStream f1 = new FileInputStream("d:/java/main2.txt");
        FileInputStream f2 = new FileInputStream("d:/main21.txt");
        FileOutputStream fout = new FileOutputStream("d:/java/comb.txt",true);
        SequenceInputStream inst = new SequenceInputStream(f1,f2);

        //------------Only read or Write-----------------

        // You can also print data or both files
        //int j;
        //while((j = inst.read()) != -1){
        //System.out.print((char)j);
        //}

        // You can also write data of two files into another files
        int i;
        while((i= inst.read()) != -1){
            fout.write(i);
        }


        fout.close();
        inst.close();
        f1.close();
        f2.close();
    }
}
