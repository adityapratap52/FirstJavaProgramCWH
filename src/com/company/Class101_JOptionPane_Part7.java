package com.company;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Class101_JOptionPane_Part7 extends WindowAdapter {
    JFrame f;
    Class101_JOptionPane_Part7(){
        f = new JFrame();
       /* String name = JOptionPane.showInputDialog(f,"Enter your name: ");
        if (name.equals("Aditya")){
            JOptionPane.showMessageDialog(f,"Welcome to Aditya"); //If you can not extends JFrame then you initialize reference of JFrame --> f
        }
        else{
            JOptionPane.showMessageDialog(f,"You are not Aditya","Alert",JOptionPane.WARNING_MESSAGE);
        }  */
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);     // It is use for cancel or no option in dialog pane
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void windowClosing(WindowEvent e){
        int a = JOptionPane.showConfirmDialog(f,"Are you sure");
        if (a == JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args) {
        new Class101_JOptionPane_Part7();
    }
}
