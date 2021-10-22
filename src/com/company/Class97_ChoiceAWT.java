package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Class97_ChoiceAWT extends Frame {
//    Class97_ChoiceAWT(){
//        Choice ch = new Choice();
//        ch.setBounds(100,100,75,75);
//        ch.add("C++");
//        ch.add("Java");
//        ch.add("PHP");
//        ch.add("HTML");
//        add(ch);
//        setSize(400,400);
//        setLayout(null);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//       new Class97_ChoiceAWT();
//    }
//}


//-------------------------------------------------------------------------------------
public class Class97_ChoiceAWT extends Frame {
    Class97_ChoiceAWT(){
        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(300,100);
        Button button = new Button("Show");
        button.setBounds(200,100,50,20);
        Choice choice = new Choice();
        choice.setBounds(100,100,75,75);
        choice.add("C++");
        choice.add("PHP");
        choice.add("HTML");
        choice.add("Java");
        choice.add("Oracle");
        choice.add("Python");
        add(choice);
        add(button);
        add(label);
        setSize(450,400);
        setLayout(null);
        setVisible(true);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = "Programming language Selected: "+ choice.getItem(choice.getSelectedIndex());
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new Class97_ChoiceAWT();
    }
}