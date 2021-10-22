package com.company;

import javax.swing.*;
public class Class101_ProgressBar_Part9 extends JFrame{
    JProgressBar jb;
    int i=0,num=0;
    Class101_ProgressBar_Part9(){
        jb=new JProgressBar(0,2000);
        jb.setBounds(40,40,160,30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250,150);
        setLayout(null);
    }
    public void iterate(){
        while(i<=2000){
            jb.setValue(i);
            i=i+20;
            try{Thread.sleep(150);}catch(Exception e){}
        }
    }
    public static void main(String[] args) {
        Class101_ProgressBar_Part9 m=new Class101_ProgressBar_Part9();
        m.setVisible(true);
        m.iterate();
    }
}    