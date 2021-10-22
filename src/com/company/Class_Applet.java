//package com.company;
//
//import java.applet.Applet;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//
//public class Class_Applet extends Applet implements MouseListener, MouseMotionListener {
//    int mouseX=0, mouseY=0;
//    String msg= "";
//    public void init(){
//        addMouseListener(this);
////        addMouseMotionListener();
//    }
//    public void mouseExited(MouseEvent me){
//        mouseX= me.getX();
//        mouseY= me.getY();
//        msg="Down";
//        repaint();
//    }
//    public void mouseReleased(MouseEvent me){
//        mouseX= me.getX();
//        mouseY= me.getY();
//        msg="Up";
//        repaint();
//    }
//    public void mouseDragged(MouseEvent me){
//        mouseX= me.getX();
//        mouseY= me.getY();
//        msg="*";
//        showStatus("Dragging at");
//    }
//}
