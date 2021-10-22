package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class101_JPassword_Part2 extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField tf;
    JPasswordField jf;
    JButton b;

    Class101_JPassword_Part2(){
        l1 = new JLabel("Username");
        l1.setBounds(50,100,100,20);
        l2 = new JLabel("Password");
        l2.setBounds(50,150,100,20);
        l3 = new JLabel();
        l3.setBounds(50,250,300,20);
        tf = new JTextField();
        tf.setBounds(150,100,100,30);
        jf = new JPasswordField();
        jf.setBounds(150,150,100,30);
        b = new JButton("Submit");
        b.setBounds(120,200,80,20);
        add(l1);add(l2);add(l3);add(b);add(tf);add(jf);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String data = "Username: "+tf.getText();
        data += ",  Password: "+new String(jf.getPassword());
        l3.setText(data);
    }
    public static void main(String[] args) {
        new Class101_JPassword_Part2();
    }
}
