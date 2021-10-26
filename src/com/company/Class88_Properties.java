package com.company;

import java.io.FileInputStream;
import java.io.*;
import java.util.*;


public class Class88_Properties {
    public static void main(String[] args) throws Exception {
        FileReader reader=new FileReader("db1.properties");

        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }
}