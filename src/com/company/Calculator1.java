package com.company;

import javax.swing.*;
import java.awt.*;

public class Calculator1 {
    Calculator1(){}
    public static void main(String []args){
        createWindow();
    }

    public static void createWindow(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
