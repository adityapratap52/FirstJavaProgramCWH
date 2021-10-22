package com.company;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class MyCalculator extends Frame implements ActionListener
{
    int c,n;
    String s1,s2,s3,s4,s5;
    Frame f;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    Panel p;
    TextField tf;
    MyCalculator()
    {
        Font font = new Font("Cambria",Font.BOLD,28);
        p = new Panel();
        setLayout(new FlowLayout());
        b1 = new Button("0");
        b1.setFont(font);
        b1.addActionListener(this);
        b2 = new Button("1");
        b2.setFont(font);
        b2.addActionListener(this);
        b3 = new Button("2");
        b3.setFont(font);
        b3.addActionListener(this);
        b4 = new Button("3");
        b4.setFont(font);
        b4.addActionListener(this);
        b5 = new Button("4");
        b5.setFont(font);
        b5.addActionListener(this);
        b6 = new Button("5");
        b6.setFont(font);
        b6.addActionListener(this);
        b7 = new Button("6");
        b7.setFont(font);
        b7.addActionListener(this);
        b8 = new Button("7");
        b8.setFont(font);
        b8.addActionListener(this);
        b9 = new Button("8");
        b9.setFont(font);
        b9.addActionListener(this);
        b10 = new Button("9");
        b10.setFont(font);
        b10.addActionListener(this);
        b11 = new Button("+");
        b11.setFont(font);
        b11.addActionListener(this);
        b12 = new Button("-");
        b12.setFont(font);
        b12.addActionListener(this);
        b13 = new Button("*");
        b13.setFont(font);
        b13.addActionListener(this);
        b14 = new Button("/");
        b14.setFont(font);
        b14.addActionListener(this);
        b15 = new Button("=");
        b15.setFont(font);
        b15.addActionListener(this);
        b16 = new Button("C");
        b16.setFont(font);
        b16.addActionListener(this);
        tf = new TextField(10);
        tf.setFont(font);
        add(tf,"North");
        p.setLayout(new GridLayout(4,4));
        p.add(b2);p.add(b3);p.add(b4);p.add(b11);p.add(b5);p.add(b6);p.add(b7);p.add(b12);p.add(b8);p.add(b9);
        p.add(b10);p.add(b13);p.add(b16);p.add(b1);p.add(b15);p.add(b14);
        add(p,"Center");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b2)
        {
            s3 = tf.getText();
            s4 = "1";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b3)
        {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3+s4;
            tf.setText(s5);
        }if(e.getSource()==b4)
    {
        s3 = tf.getText();
        s4 = "3";
        s5 = s3+s4;
        tf.setText(s5);
    }
        if(e.getSource()==b5)
        {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b6)
        {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b7)
        {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b9)
        {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b10)
        {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b11)
        {
            s1 = tf.getText();
            tf.setText("");
            c=1;

        }
        if(e.getSource()==b12)
        {
            s1 = tf.getText();
            tf.setText("");
            c=2;

        }
        if(e.getSource()==b13)
        {
            s1 = tf.getText();
            tf.setText("");
            c=3;

        }
        if(e.getSource()==b14)
        {
            s1 = tf.getText();
            tf.setText("");
            c=4;

        }
        if(e.getSource()==b15)
        {
            s2 = tf.getText();
            if(c==1)
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(c==2)
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(c==3)
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            if(c==4)
            {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0)
                    {
                        n = Integer.parseInt(s1)/Integer.parseInt(s2);
                        tf.setText(String.valueOf(n));
                    }
                    else
                        tf.setText("infinite");

                }
                catch(Exception i){
                    System.out.println("This is not right");
                }
            }
            if(c==5)
            {
                n = Integer.parseInt(s1)%Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==b16)
        {
            tf.setText("");
        }
    }

    public static void main(String[] abc)
    {
        MyCalculator calc = new MyCalculator();
        calc.setTitle("MyCalculator");
        calc.setSize(250,300);
        calc.setVisible(true);
    }
}
