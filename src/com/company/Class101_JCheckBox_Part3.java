package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class101_JCheckBox_Part3 extends JFrame implements ActionListener {
    JCheckBox ch1,ch2,ch3;
    JLabel l;
    JButton b;
    Class101_JCheckBox_Part3(){
        l = new JLabel("Food Ordering System");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(300,100);
        ch1 = new JCheckBox("Pizza @ 100");
        ch1.setBounds(80,100,150,30);
        ch2 = new JCheckBox("Burger @ 30");
        ch2.setBounds(80,150,150,30);
        ch3 = new JCheckBox("Tea @ 10");
        ch3.setBounds(80,200,150,30);
        b = new JButton("Order");
        b.setBounds(80,250,100,20);
        b.addActionListener(this);
        add(ch1);add(ch2);add(ch3);add(b);add(l);
        setSize(300,350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String msg = "";
        float amount = 0;
        if (ch1.isSelected()){
            amount += 100;
            msg += "Pizza 100\n";
        }
        if (ch2.isSelected()){
            amount += 30;
            msg += "Burger 30\n";
        }
        if (ch3.isSelected()){
            amount +=10;
            msg += "Tea 10\n";
        }
        msg += "----------------------\n";
        JOptionPane.showMessageDialog(this,"Item: "+msg+"Total: "+amount);
    }
    public static void main(String[] args) {
        new Class101_JCheckBox_Part3();
    }
}
