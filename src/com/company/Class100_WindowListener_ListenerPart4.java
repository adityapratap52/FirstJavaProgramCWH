package com.company;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Class100_WindowListener_ListenerPart4 extends Frame implements WindowListener {
    Class100_WindowListener_ListenerPart4(){
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        addWindowListener(this);
    }
    public void windowActivated(WindowEvent e){
        System.out.println("Window Activated");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Window Deactivated");
    }
    public void windowOpened(WindowEvent e){
        System.out.println("Window Opened");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent e){
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent e){
        System.out.println("Window Iconified");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Window Deiconified");
    }

    public static void main(String[] args) {
        new Class100_WindowListener_ListenerPart4();
    }
}
