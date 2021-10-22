package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class101_SwingBasic_Part1 implements ActionListener {
    JButton b;
    JTextField tf;
    Class101_SwingBasic_Part1(){
        JFrame f = new JFrame("Swing in Java");
        b = new JButton(new ImageIcon("D:\\Png.png"));          // And Image
        b.setBounds(100,150,40,20);
        tf = new JTextField();
        tf.setEditable(false);
        tf.setBounds(60,100,200,30);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(b);f.add(tf);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome back Aditya");
    }

    public static void main(String[] args) {
        new Class101_SwingBasic_Part1();
    }
}
