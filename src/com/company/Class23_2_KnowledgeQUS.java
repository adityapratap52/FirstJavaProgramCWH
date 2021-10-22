package com.company;

public class Class23_2_KnowledgeQUS {
    public void myMethod()
    {
        System.out.println("Method");
    }

    {
        System.out.println("Instance Block");
    }

    Class23_2_KnowledgeQUS()
    {
        System.out.println("Constructor ");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        Class23_2_KnowledgeQUS c = new Class23_2_KnowledgeQUS();
        c.myMethod();
    }
    //What is the output----------------------------------------------------------------
//    static int a = 10;
//    static int n;
//    int b = 5;
//    int c;
//    public Class23_2_KnowledgeQUS(int m) {
//        System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);
//    }
//    // Instance Block
//    {
//        b = 30;
//        n = 20;
//    }
//    // Static Block
//    static
//    {
//        a = 60;
//    }
//    public static void main(String[] args) {
//        Class23_2_KnowledgeQUS obj = new Class23_2_KnowledgeQUS(n);
//    }
}
