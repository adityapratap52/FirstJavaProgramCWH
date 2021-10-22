package com.company;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionListener;

public class Class101_Table_Part6 extends JFrame  {

    Class101_Table_Part6(){
        String [][]data = {{"1","Ram","30000"},{"2","Asmit","34000"},{"3","Rahul","40000"}};
        String []column = {"Roll No","Name","Salary"};
        JTable t = new JTable(data,column);
        t.setBounds(50,50,300,300);
        JScrollPane sp = new JScrollPane(t);
        //sp.setBounds(0,0,300,300);
        add(sp);
        setSize(400,400);
        //setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Class101_Table_Part6();
    }
}



/* public class Class101_Table_Part6 extends JFrame{
    Class101_Table_Part6() {
        String[][] data = {{"1", "Ram", "30000"}, {"2", "Asmit", "34000"}, {"3", "Rahul", "40000"}};
        String[] column = {"Roll No", "Name", "Salary"};
        JTable jt = new JTable(data, column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select= jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String Data = null;
                int[] row = jt.getSelectedRows();
                int[] columns = jt.getSelectedColumns();
                for (int i = 0; i < row.length; i++) {
                    for (int j = 0; j < columns.length; j++) {
                        Data = (String) jt.getValueAt(row[i], columns[j]);
                    } }
                System.out.println("Table element selected is: " + Data);
            }
        });
        jt.setBounds(50, 50, 300, 300);
        JScrollPane sp = new JScrollPane(jt);
        add(sp);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Class101_Table_Part6();
    }
}
 */