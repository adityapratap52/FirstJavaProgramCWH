package com.company;

public class Chap3_Practice_Set {
    public static void main(String[] args) {
        String name = "Aditya Pratap Singh";
        String name2 = "Good Morning <|Name|> Have a Good Day";

        // Question1 - Convert to String in lowerCase
//        System.out.println(name.toLowerCase());

        // Question2 - Replace spaces into underscores
//        System.out.println(name.replace(" ", " _"));

        // Question3 - change <|Name|> to any name
//        System.out.println(name2.replace("<|Name|>", "Aditya"));

        // Question4 - Detect double and triple spaces
//        String space = "Hii bro    what are you doing here";
//        System.out.println(space.indexOf("  "));
//        System.out.println(space.indexOf("    "));

        // Question5 - Use escape sequence
        String esc = "Dear Aadi,\n\t This is Java Course is nice.\nThanks";
        System.out.println(esc);
    }
}
