package com.company;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//public class Class96_CheckBoxGroup_Part2 extends Frame{
//    Class96_CheckBoxGroup_Part2(){
//        CheckboxGroup group = new CheckboxGroup();
//        Checkbox ch1 = new Checkbox("C++",group,false);     // false means default un-tick
//        ch1.setBounds(100,100,50,50);
//        Checkbox ch2 = new Checkbox("Java",group,true);     // true means default tick
//        ch2.setBounds(100,150,50,50);
//        add(ch1);add(ch2);
//        setSize(400,400);
//        setLayout(null);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Class96_CheckBoxGroup_Part2();
//    }
//}

//------------------------------------------------------------------
public class Class96_CheckBoxGroup_Part2 extends Frame{
    Class96_CheckBoxGroup_Part2(){
        setTitle("MyGroup");
        Label l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        CheckboxGroup group = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("C++",group,true);
        ch1.setBounds(100,100,50,50);
        Checkbox ch2 = new Checkbox("Java",group,true);
        ch2.setBounds(100,150,50,50);
        add(ch1);add(ch2);
        add(l);
        setSize(450,400);
        setLayout(null);
        setVisible(true);
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("C++ Checked: Checked");
            }
        });
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("Java Checked: Checked");
            }
        });
    }

    public static void main(String[] args) {
        new Class96_CheckBoxGroup_Part2();
    }
}
