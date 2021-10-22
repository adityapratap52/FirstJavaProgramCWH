package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Class71_BufferWriter {
    public static void main(String[] args) throws IOException {

        BufferedWriter f =  new BufferedWriter(new FileWriter("d:/java/main21.txt",true));
                    //-------------OR--------------
//        FileWriter f1 = new FileWriter("d:/java/main21.txt",true);
//        BufferedWriter f =  new BufferedWriter(f1);

        f.write("  Computer times are best times and most popular");
        f.close();
    }
}
