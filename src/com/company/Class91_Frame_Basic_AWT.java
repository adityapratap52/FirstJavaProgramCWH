package com.company;

import java.awt.*;

public class Class91_Frame_Basic_AWT {
    Class91_Frame_Basic_AWT(){
        Frame f = new Frame("MyFrame");
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        Button b = new Button("Click me");
        b.setBounds(30,100,80,30);
        f.add(b);
    }

    public static void main(String[] args) {
        Class91_Frame_Basic_AWT cb = new Class91_Frame_Basic_AWT();
    }
}
