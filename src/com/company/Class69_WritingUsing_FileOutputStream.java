package com.company;

import java.io.FileOutputStream;
import java.io.IOException;

public class Class69_WritingUsing_FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("d:/java/main2.txt",true);
        String s = "Tata";

//        char []ch = s.toCharArray();
//        for (int i=0; i<s.length(); i++){
//            fout.write(ch[i]);
//        }

        //-------------OR------------
        byte []b = s.getBytes();	// Convert String into byte array
        fout.write(b);

        fout.close();
    }
}
