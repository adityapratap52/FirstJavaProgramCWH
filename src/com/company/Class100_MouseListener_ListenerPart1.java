package com.company;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* public class Class100_MouseListener extends Frame implements MouseListener{
    Label l;
    Class100_MouseListener() {
        l = new Label();
        l.setBounds(50, 100, 100, 30);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        //--------------------------------------------------------------------------------------
//        addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                l.setText("Mouse Clicked");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                l.setText("Mouse Pressed");
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                l.setText("Mouse Released");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                l.setText("Mouse Entered");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                l.setText("Mouse Exit");
//            }
//        });
        //------------------------------------------OR---------------------------------------------
        addMouseListener(this);
    }
            @Override
            public void mouseClicked(MouseEvent e) {
                l.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                l.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                l.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l.setText("Mouse Exited");

            }

 */
public class Class100_MouseListener_ListenerPart1 extends MouseAdapter {
    Frame f;
    Class100_MouseListener_ListenerPart1(){
        f = new Frame("Mouse Adapter");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(),e.getY(),50,50);
    }
    public void mouseEntered(MouseEvent e){                         // This is not important that you can initialize all methods of MouseListener
        Graphics g = f.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillOval(e.getX(),e.getY(),50,50);
    }
    public void mouseExited(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.GREEN);
        g.fillOval(e.getX(),e.getY(),50,50);
    }
    public static void main(String[] args) {
        Class100_MouseListener_ListenerPart1 ml = new Class100_MouseListener_ListenerPart1();
    }
}
