package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Class93_AWTLabel {
//    public static void main(String[] args) {
//        Frame f = new Frame();
//        Label l1,l2;
//        l1 = new Label("------------First Label-----------");
//        l1.setBounds(50,100,200,30);
//        l2 = new Label("------------Second Label----------");
//        l2.setBounds(50,150,200,30);
//        f.add(l2);
//        f.add(l1);
//        f.setSize(300,300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

// AWT Label with ActionListener

public class Class93_AWTLabel extends Frame implements ActionListener {
TextField tf;
Label l;
Button b;
    Class93_AWTLabel(){
        tf = new TextField();
        tf.setBounds(50,30,100,30);
        l = new Label();
        l.setBounds(30,80,100,30);
        b = new Button("Find IP");
        b.setBounds(80,150,50,20);
        b.addActionListener(this);
        add(tf);
        add(l);
        add(b);
        setSize(400,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("Ip of "+host+" is "+ip);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Class93_AWTLabel();
    }
}
