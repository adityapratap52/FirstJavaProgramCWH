package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class94_AWTTextField extends Frame implements ActionListener {
    TextField tf1,tf2,tf3;
    Button b1,b2;
    Class94_AWTTextField(){
        tf1 = new TextField();
        tf1.setBounds(50,50,100,20);
        tf2 = new TextField();
        tf2.setBounds(50,100,100,20);
        tf3 = new TextField();
        tf3.setBounds(50,150,100,20);
        tf3.setEditable(false);
        b1 = new Button("+");
        b1.setBounds(80,200,40,40);
        b2 = new Button("-");
        b2.setBounds(150,200,40,40);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf1);add(tf2);add(tf3);add(b1);add(b2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource()==b1){
            c = a+b;
        }else if (e.getSource()==b2){
            c = a-b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        Class94_AWTTextField caf = new Class94_AWTTextField();
    }
}
