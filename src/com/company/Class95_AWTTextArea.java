package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

//public class Class95_AWTTextArea extends Frame {
//    Class95_AWTTextArea(){
//        TextArea tr = new TextArea("This is my \n Car and I am a rich and I am a rich and I am a rich person so \n don't and I am a rich and I am a rich talk this word bcz you are \n  and I am a rich and I am a richa poor person in this word understand \n  and I am a rich  and I am a rich  and I am a rich  and I am a rich \n  and I am a rich  and I am a rich  and I am a rich  and I am a rich");
//        tr.setBounds(30,80,300,80);
//        add(tr);
//        setSize(500,300);
//        setLayout(null);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Class95_AWTTextArea();
//    }
//}

//------------------------------------------------------------------------------------------------
public class Class95_AWTTextArea extends Frame implements ActionListener{
    Label l1,l2;
    TextArea area;
    Button b;

    Class95_AWTTextArea(){
        l1 = new Label();
        l1.setBounds(50,50,100,30);
        l2 = new Label();
        l2.setBounds(160,50,100,30);
        area = new TextArea();
        area.setBounds(20,100,300,300);
        b = new Button("Count Words");
        b.setBounds(100,400,100,30);
        b.addActionListener(this);
        add(l1);add(l2);add(area);add(b);
        setSize(400,450);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String text = area.getText();
        String []words = text.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Characters: "+text.length());
    }

    public static void main(String[] args) {
        new Class95_AWTTextArea();
    }
}

