package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Class72_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("d:/main21.txt"));
        //-------------------------------------------------------------------------------------
        //int ch = bf.read();                       // Only read one character
        //System.out.print((char)ch);

        //-------------------------------------------------------------------------------------
        //int ch;
        //while ((ch=bf.read()) != -1)              // Read all character
            //System.out.print((char)ch);

        //-------------------------------------------------------------------------------------
        //String s;
        //s= bf.readLine();                         // Read only one string line
        //System.out.print(s);

        //-------------------------------------------------------------------------------------
        //String s;
        //while ((s = bf.readLine()) != null)       // Read only one string line
            //System.out.print(s);

        //-------------------------------------------------------------------------------------
        char []c = new char[20];        // Offset + length <= index otherwise IndexOutOfBoundsException
        bf.read(c,2,8);       //first s is contain values, 2 is offset means storing started from second index, 8 is character values length
        System.out.println(c);        // offset is not show into Intellij Idea

        bf.close();
    }
}
