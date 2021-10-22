package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class101_JMenuBarJMenuMenuItem_Part8 implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll;
    JTextField tf;

    Class101_JMenuBarJMenuMenuItem_Part8(){
        JFrame f = new JFrame("Notepad");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("SelectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
        mb = new JMenuBar();
        mb.add(file);mb.add(edit);mb.add(help);
        tf = new JTextField();
        tf.setBounds(50,80,200,20);
        f.add(tf);f.add(mb);
        f.setJMenuBar(mb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == cut){
            tf.cut();
        }
        else if (e.getSource() == copy){
            tf.copy();
        }
        else if (e.getSource() == paste){
            tf.paste();
        }
        else if (e.getSource() == selectAll){
            tf.selectAll();
        }
    }

    public static void main(String[] args) {
        new Class101_JMenuBarJMenuMenuItem_Part8();
    }
}
