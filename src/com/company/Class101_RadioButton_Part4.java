package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class101_RadioButton_Part4 extends JFrame implements ActionListener {
    JRadioButton cb1,cb2;
    JLabel l;
    JButton b;
    Class101_RadioButton_Part4(){
        l = new JLabel("Select your Gender");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(300,80);
        cb1 = new JRadioButton("A) Male");
        cb1.setBounds(100,100,100,30);
        cb2 = new JRadioButton("A) Female");
        cb2.setBounds(100,150,100,30);
        b = new JButton("Show");
        b.setBounds(100,200,100,20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(cb1);bg.add(cb2);
        b.addActionListener(this);
        add(l);add(cb1);add(cb2);add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if (cb1.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Male");
        }
        else if (cb2.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Female");
        }
    }
    public static void main(String[] args) {
        new Class101_RadioButton_Part4();
    }
}
