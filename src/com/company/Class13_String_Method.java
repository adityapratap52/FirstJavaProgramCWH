package com.company;

//import java.util.Scanner;

public class Class13_String_Method {
    public static void main(String[] args) {
//        String Name = "Aditya Pratap Singh";
//        String Name1 = "Prabhat Kumar";
//        String Name2 = "Prabhat Kumar Pra";
        String Name3 = "Prabhat ";

        // Compare two string if value is equal to String then return 1 otherwise return -1
//        System.out.println(Name3.compareTo("prAbhat"));       // Depend to Case
//        System.out.println(Name3.compareToIgnoreCase("prAbhat"));   // for any Case

        // Combine two string
        String a = Name3.concat("is a good boy");
        System.out.println(a);
        System.out.println( Name3.concat("is a good boy"));

        // Check the given number is equal or not
//        System.out.println(Name3.equals("Prabhat "));
//        System.out.println(Name3.equals("Prabhat"));    // Because String contain Whitespace
//        System.out.println(Name3.equals("prabhat "));
//        System.out.println(Name3.equals(Name1));
//        System.out.println(Name3.equalsIgnoreCase("praBHat "));

        // What is the index no of given character from ending
//        System.out.println(Name.lastIndexOf("a"));
//        System.out.println(Name.lastIndexOf("a",10));

        // What is the index no of given character from starting
//        System.out.println(Name.indexOf("r"));
//        System.out.println(Name.indexOf("tap"));
//        System.out.println(Name.indexOf("Pra"));
//        System.out.println(Name2.indexOf("Pra",1));

        // What is the character in index 0,1
//        System.out.println(Name.charAt(0));
//        System.out.println(Name.charAt(8));

        // Using to endsWith for check that this substring is present in String
//        System.out.println(Name.endsWith("  "));
//        System.out.println(Name1.endsWith("Kumar"));

        // Check String that it is stat from that substring or not
//        System.out.println(Name.startsWith("A"));
//        System.out.println(Name.startsWith("a"));
//        System.out.println(Name.startsWith("Adi"));
//        System.out.println(Name.startsWith("ADI"));

        // String Replace by other substring/character
//        System.out.println(Name.replace('i','o'));
//        System.out.println(Name.replace("i","RAJA"));
//        System.out.println(Name.replace('a','2'));
//        System.out.println(Name.replace("a","567"));

        // String using substring
//        System.out.println(Name.substring(1));
//        System.out.println(Name.substring(2,5));

        // String after trimming
//        System.out.println(Name);
//        System.out.println(Name.trim());

        // String in lower case and UPPER CASE
//        System.out.println(Name.toLowerCase());
//        System.out.println(Name.toUpperCase());

        // String length
//        System.out.println(Name.length());
//        int value = Name.length();
//        System.out.println(value);

    }
}
