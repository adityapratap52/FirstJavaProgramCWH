package com.company;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Class96_AWT_Checkbox {
    Class96_AWT_Checkbox(){
        Frame f = new Frame("CheckBox Example");
        Label label1 = new Label();
        label1.setAlignment(Label.CENTER);
        label1.setSize(200,100);
        Checkbox ch1 = new Checkbox("C++");
        ch1.setBounds(100,100,50,50);
        Checkbox ch2 = new Checkbox("Java");
        ch2.setBounds(100,150,50,50);
        f.add(ch1);
        f.add(ch2);
        f.add(label1);
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label1.setText("C Checkbox: "+(e.getStateChange()== 1 ?"checked":"unchecked"));
            }
        });
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e1) {
                label1.setText("Java Checkbox: "+(e1.getStateChange()== 1 ?"checked":"unchecked"));
            }
        });
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Class96_AWT_Checkbox  cht = new  Class96_AWT_Checkbox();
    }
}
