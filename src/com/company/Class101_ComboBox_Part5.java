package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class101_ComboBox_Part5 extends JFrame implements ActionListener {
    JComboBox cb;
    JLabel l;
    Class101_ComboBox_Part5(){
        l = new JLabel();
        l.setBounds(50,50,250,20);
        String []country={"India","Aus","U.S.A","England","Newzealand"};
        cb=new JComboBox(country);
        cb.setBounds(50, 150,90,20);
        JButton b = new JButton("Show");
        b.setBounds(180,150,80,20);
        b.addActionListener(this);
        add(cb);add(b);add(l);
        setLayout(null);
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String data = "Country Selected: "+cb.getItemAt(cb.getSelectedIndex());
        l.setText(data);
    }
    public static void main(String[] args) {
        new Class101_ComboBox_Part5();
    }
}
