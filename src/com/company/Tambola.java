package com.company;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tambola extends JFrame implements ActionListener{
    private JPanel pnlBoard, pnlButton;
    private JButton btnNext, btnReset;
    private JLabel lbl[] = new JLabel[90];
    private JLabel lblNumber;
    private int[] random_number = new int[90];
    private int pos = 0;

    public Tambola(String title){
        super(title);
        setVisible(true);
        setSize(500,500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addElements();
        pack();
    }

    public void addElements(){

        lblNumber = new JLabel("Tambola Game");
        lblNumber.setHorizontalAlignment(0);
        lblNumber.setFont(new Font("Cambria",Font.BOLD,28));
        lblNumber.setForeground(Color.BLUE);
        add(lblNumber,BorderLayout.NORTH);

        pnlBoard = new JPanel();
        pnlBoard.setLayout(new GridLayout(10,10));
        add(pnlBoard,BorderLayout.CENTER);

        for(int i = 0 ; i < random_number.length ; i++){
            lbl[i] = new JLabel(""+(i+1));
            lbl[i].setHorizontalAlignment(0);
            pnlBoard.add(lbl[i]);
            lbl[i].setOpaque(true);
            lbl[i].setBackground(Color.WHITE);
            random_number[i] = i;
        }

        Random rnd = new Random();
        for (int i = random_number.length - 1 ; i > 0 ; i--){
            int index = rnd.nextInt(i + 1);
            int a = random_number[index];
            random_number[index] = random_number[i];
            random_number[i] = a;
        }

        pnlButton = new JPanel();
        add(pnlButton,BorderLayout.SOUTH);
        pnlButton.setLayout(new GridLayout(2,2));

        btnNext = new JButton("Next");
        pnlButton.add(btnNext);
        btnNext.addActionListener(this);

        btnReset = new JButton("Reset");
        btnReset.addActionListener(this);
        pnlButton.add(btnReset);

        lblNumber = new JLabel("Chossed Number: " +random_number[pos]);
        pnlButton.add(lblNumber);
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        if(command == "Next"){
            lbl[random_number[pos]].setBackground(Color.BLACK);
            lbl[random_number[pos]].setForeground(Color.WHITE);
            lblNumber.setText("Choosed Number: " +(random_number[pos]+1));
            pos++;
            System.out.println (random_number[pos]);
        }

        else{
            pos = 0;
            for (JLabel jLabel : lbl) {
                jLabel.setBackground(Color.WHITE);
                jLabel.setForeground(Color.BLACK);
            }
        }
    }

    public static void main (String[] args) {
        new Tambola("Tambola");
    }
}