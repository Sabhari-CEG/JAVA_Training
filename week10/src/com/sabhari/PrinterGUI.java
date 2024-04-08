package com.sabhari;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.*;

public class PrinterGUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("PRINTER");
        JLabel label1 = new JLabel();
        label1.setText("Printer:MyPrinter");
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBounds(0,0,120,200);
        frame.add(panel1);
        JTextField tf1 = new JTextField();
        tf1.setBounds(5,30,150,150);
        frame.add(tf1);
        JCheckBox cb1 = new JCheckBox("Image");
        cb1.setBounds(160,30,80,20);
        frame.add(cb1);
        JCheckBox cb2 = new JCheckBox("Text");
        cb2.setBounds(160,95,80,20);
        frame.add(cb2);
        JCheckBox cb3 = new JCheckBox("Code");
        cb3.setBounds(160,160,80,20);
        frame.add(cb3);
        JTextField tf2 = new JTextField();
        tf2.setBounds(250,30,150,150);
        frame.add(tf2);
        JRadioButton rb1 = new JRadioButton("Selection");
        rb1.setBounds(400,30,80,20);
        ButtonGroup g1 = new ButtonGroup();
        g1.add(rb1);
        JRadioButton rb2 = new JRadioButton("All",true);
        rb2.setBounds(400,95,80,20);

        g1.add(rb2);
        JRadioButton rb3 = new JRadioButton("Applet");
        rb3.setBounds(400,160,80,20);
        g1.add(rb3);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);
        JTextField tf3 = new JTextField();
        tf3.setBounds(500,30,150,150);
        frame.add(tf3);
        JButton b1 = new JButton("Ok");
        b1.setBounds(670,10,80,23);
        frame.add(b1);
        JButton b2 = new JButton("cancel");
        b2.setBounds(670,70,80,23);
        frame.add(b2);
        JButton b3 = new JButton("Setup properties");
        b3.setBounds(670,130,80,23);
        frame.add(b3);
        JButton b4 = new JButton("Help");
        b4.setBounds(670,190,80,23);
        frame.add(b4);
        JLabel lab1 = new JLabel("Print Quality:");
        lab1.setBounds(50,200,100,20);
        frame.add(lab1);
        String[] quality = {"High","Medium","Low"};
        JComboBox cb = new JComboBox(quality);
        cb.setBounds(180,200,100,20);
        cb.setBackground(Color.lightGray);
        frame.add(cb);
        JCheckBox cb5 = new JCheckBox("Print to File");
        cb5.setBounds(500,200,100,20);
        frame.add(cb5);
        frame.setSize(820,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
