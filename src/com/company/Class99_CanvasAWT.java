package com.company;

import java.awt.*;
class MyCanvas extends Canvas{
    public MyCanvas(){
        setBackground(Color.GRAY);
        setSize(300,300);
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fill3DRect(50,50,50,50,true);
        g.fillArc(120,50,50,50,30,90);
        g.fillOval(180,50,50,50);
        g.fillRoundRect(50,150,100,100,60,90);
    }
}
public class Class99_CanvasAWT extends Frame {
    Class99_CanvasAWT(){
        add(new MyCanvas());
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Class99_CanvasAWT();
    }
}
