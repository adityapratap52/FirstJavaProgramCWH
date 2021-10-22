package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class100_KeyListener_ListenerPart3 extends Frame implements KeyListener {
    Label l;
    Class100_KeyListener_ListenerPart3(){
        l = new Label();
        l.setBounds(50,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e){
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e){
        l.setText("Key Typed");
    }
    public static void main(String[] args) {
        new Class100_KeyListener_ListenerPart3();
    }
}
