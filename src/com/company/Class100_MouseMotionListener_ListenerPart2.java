package com.company;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Class100_MouseMotionListener_ListenerPart2 extends Frame implements MouseMotionListener {
    Label l;
    Class100_MouseMotionListener_ListenerPart2(){
        l = new Label();
        l.setBounds(50,50,150,30);
        add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e){
        l.setText("X= "+e.getX()+", Y= "+e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public void mouseMoved(MouseEvent e){
        l.setText("X= "+e.getX()+", Y= "+e.getY());
    }

    public static void main(String[] args) {
        new Class100_MouseMotionListener_ListenerPart2();
    }
}
