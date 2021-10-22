package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Class98_ListAWT extends Frame {
//    Class98_ListAWT(){
//        List l1 = new List(5);
//        l1.setBounds(100,100,75,75);
//        l1.add("item1");
//        l1.add("item2");
//        l1.add("item3");
//        l1.add("item4");
//        l1.add("item5");
//        l1.add("item6");
//        l1.add("item7");
//        l1.add("item8");
//        add(l1);
//        setLayout(null);
//        setSize(400,400);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Class98_ListAWT();
//    }
//}

//------------------------------------------------------------------------
public class Class98_ListAWT extends Frame {
    Class98_ListAWT(){
        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(500,100);
        Button button = new Button("Show");
        button.setBounds(200,150,80,30);
        List list = new List(4,false);
        list.setBounds(100,100,70,70);
        list.add("C");
        list.add("C++");
        list.add("Java");
        list.add("PHP");

        List list1 = new List(4,true);
        list1.setBounds(100,200,70,70);
        list1.add("Turbo C++");
        list1.add("Spring");
        list1.add("Hibernate");
        list1.add("CodeIgniter");
        add(button);add(label);add(list);add(list1);
        setSize(500,450);
        setLayout(null);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Programming Language Selected: "+ list.getItem(list.getSelectedIndex());
                data += "      Framework Selected: ";
                for (String frame:list1.getSelectedItems()){
                    data += frame+" ";
                }
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new Class98_ListAWT();
    }
}
