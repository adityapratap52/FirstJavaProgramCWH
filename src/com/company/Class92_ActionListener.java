package com.company;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Class92_ActionListener extends Frame implements ActionListener {
//    TextField tf;
//
//    Class92_ActionListener(){
//        // create components
//        tf=new TextField();
//        tf.setBounds(60,50,170,20);
//        Button b = new Button("Click me");
//        b.setBounds(100,120,80,30);
//
//        //register Listener
//        b.addActionListener(this);                  // Passing current instance
//
//        //add component and set size, layout and visibility
//        add(b);
//        add(tf);
//        setSize(300,300);
//        setLayout(null);
//        setVisible(true);
//    }
//    public void actionPerformed(ActionEvent e){
//        tf.setText("Welcome");
//    }
//    public static void main(String[] args) {
//        new Class92_ActionListener();
//    }
//}

//-----------Java event handling by outer class-----------------------

//class Outer11 implements ActionListener{
//    Class92_ActionListener obj;
//    Outer11(Class92_ActionListener obj){
//        this.obj = obj;
//    }
//    public void actionPerformed(ActionEvent e){
//        obj.tf.setText("Welcome");
//    }
//}
//
//public class Class92_ActionListener extends Frame{
//    TextField tf;
//
//    Class92_ActionListener(){
//        tf = new TextField();
//        tf.setBounds(80,80,200,40);
//        Button b = new Button("Click me");
//        b.setBounds(120,150,60,30);
//
//        //Register Listener
//        Outer11 o = new Outer11(this);
//        b.addActionListener(o);
//
//        setSize(300,300);
//        setLayout(null);
//        setVisible(true);
//        add(tf);
//        add(b);
//    }
//
//    public static void main(String[] args) {
//        new Class92_ActionListener();
//    }
//}

//--------------------- Java Event Handling by anonymous class------------------------(it is not work properly
public class Class92_ActionListener extends Frame{
    final TextField tf;
    Class92_ActionListener(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        b.setBounds(50,120,80,30);
        // Create anonymous class
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome");
            }
        });
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
       new Class92_ActionListener();
    }
}