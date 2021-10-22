package com.company;

import java.util.Stack;

public class Class85_2_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.push(2);
        s1.push(4);
        s1.push(6);
        s1.push(8);
        s2.push(18);
        s2.push(38);
        s2.push("Mohan");
        s2.push(null);
        s2.addAll(0,s1);

        System.out.println("Upper value: "+s2.peek());
        s2.pop();
        s2.pop();
        System.out.println("Upper value: "+s2.peek());
        //System.out.println("Is Empty: "+s1.empty());
        System.out.println(s2.search(28));          // If value present in the stack then return position otherwise return -1

        System.out.println(s2);


    }
}
