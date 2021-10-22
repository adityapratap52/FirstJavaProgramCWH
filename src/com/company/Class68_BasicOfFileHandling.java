package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Class68_BasicOfFileHandling {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:/java/Main2.txt");
        //f1.createNewFile();
       //f1.delete();
        System.out.println("Is Exist: "+f1.exists());
        System.out.println("Is Length: "+f1.length());
        System.out.println("Name of File: "+f1.getName());
        System.out.println("Can we write in File: "+f1.canWrite());


            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()) {
                String a = sc.nextLine();
                System.err.println(a);
            }
                sc.close();
    }
}
