package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class75_FileReader_FileWriter {
    public static void main(String []args) throws IOException {
        //FileWriter f = new FileWriter("d:/java/main2.txt",true);
        //f.write("This is writer method");
        //f.close();

        //-----------OR--------------------

        FileReader f1 = new FileReader("d:/java/main2.txt");
        int i;
        while((i=f1.read()) != -1){
        System.out.print((char)i);
        }
        f1.close();
    }
}
