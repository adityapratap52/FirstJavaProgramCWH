package com.company;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.SequenceInputStream;
//import java.util.Enumeration;
//import java.util.Vector;
import  java.io.*;
import java.util.*;

public class Class74_EnumerationSequenceIS {
    public static void main(String []args) throws IOException{
        FileInputStream f1 = new FileInputStream("d:/java/main2.txt");
        FileInputStream f2 = new FileInputStream("d:/java/main3.txt");
        FileInputStream f3 = new FileInputStream("d:/java/main4.txt");
        FileInputStream f4 = new FileInputStream("d:/main21.txt");
        FileOutputStream sout = new FileOutputStream("d:/main22.txt",true);
        Vector v = new Vector();
        v.add(f1);
        v.add(f2);
        v.add(f3);
        v.add(f4);

        Enumeration e = v.elements();

        SequenceInputStream bin = new SequenceInputStream(e);

//        int i;
//        while((i=bin.read()) != -1){
//            System.out.print((char)i);
//        }

        //--------------------OR----------------------

        int j;
        while((j=bin.read()) != -1){
            sout.write(j);
        }

        bin.close();
        sout.close();
        f1.close();
        f2.close();
        f3.close();
        f4.close();
    }
}
