package com.sabhari;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insert {
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
    static JFrame frame2;
    static JButton ins;
    static String url = "jdbc:mysql://localhost/studentinfo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String UserName = "sabhari";
    static String PassWord = "2000";
    static Connection con;

    public Insert() {
        frame2 = new JFrame("Inserting into db");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Error in Registering jdbc");
        }
        try {
            con = DriverManager.getConnection(url, UserName, PassWord);
            System.out.println("Connected to database successfully!!");
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Error in connecting to jdbc");
        }
        JLabel lab3 = new JLabel("Roll Number");
        JPanel pan3 = new JPanel();
        pan3.add(lab3);
        pan3.setBounds(30, 20, 100, 20);
        frame2.add(pan3);
        tf1 = new JTextField();
        tf1.setBounds(150, 20, 180, 20);
        frame2.add(tf1);

        JLabel lab4 = new JLabel("Name");
        JPanel pan4 = new JPanel();
        pan4.add(lab4);
        pan4.setBounds(30, 60, 80, 20);
        frame2.add(pan4);
        tf2 = new JTextField();
        tf2.setBounds(150, 60, 180, 20);
        frame2.add(tf2);

        JLabel lab5 = new JLabel("Age");
        JPanel pan5 = new JPanel();
        pan5.add(lab5);
        pan5.setBounds(30, 100, 80, 20);
        frame2.add(pan5);
        tf3 = new JTextField();
        tf3.setBounds(150, 100, 180, 20);
        frame2.add(tf3);

        JLabel lab6 = new JLabel("Gender");
        JPanel pan6 = new JPanel();
        pan6.add(lab6);
        pan6.setBounds(30, 140, 80, 20);
        frame2.add(pan6);
        tf4 = new JTextField();
        tf4.setBounds(150, 140, 180, 20);
        frame2.add(tf4);

        JLabel lab7 = new JLabel("Address");
        JPanel pan7 = new JPanel();
        pan7.add(lab7);
        pan7.setBounds(30, 180, 80, 20);
        frame2.add(pan7);
        tf5 = new JTextField();
        tf5.setBounds(150, 180, 180, 20);
        frame2.add(tf5);

        JLabel lab8 = new JLabel("Mark 1");
        JPanel pan8 = new JPanel();
        pan8.add(lab8);
        pan8.setBounds(30, 220, 80, 20);
        frame2.add(pan8);
        tf6 = new JTextField();
        tf6.setBounds(150, 220, 180, 20);
        frame2.add(tf6);

        JLabel lab9 = new JLabel("Mark 2");
        JPanel pan9 = new JPanel();
        pan9.add(lab9);
        pan9.setBounds(30, 260, 80, 20);
        frame2.add(pan9);
        tf7 = new JTextField();
        tf7.setBounds(150, 260, 180, 20);
        frame2.add(tf7);

        JLabel lab10 = new JLabel("Mark 3");
        JPanel pan10 = new JPanel();
        pan10.add(lab10);
        pan10.setBounds(30, 300, 80, 20);
        frame2.add(pan10);
        tf8 = new JTextField();
        tf8.setBounds(150, 300, 180, 20);
        frame2.add(tf8);

        JLabel lab11 = new JLabel("Mark 4");
        JPanel pan11 = new JPanel();
        pan11.add(lab11);
        pan11.setBounds(30, 340, 80, 20);
        frame2.add(pan11);
        tf9 = new JTextField();
        tf9.setBounds(150, 340, 180, 20);
        frame2.add(tf9);

        JLabel lab12 = new JLabel("Mark 5");
        JPanel pan12 = new JPanel();
        pan12.add(lab12);
        pan12.setBounds(30, 380, 80, 20);
        frame2.add(pan12);
        tf10 = new JTextField();
        tf10.setBounds(150, 380, 180, 20);
        frame2.add(tf10);

        JLabel lab13 = new JLabel();
        JPanel pan13 = new JPanel();
        pan13.add(lab13);
        pan13.setBounds(30, 380, 80, 20);
        frame2.add(pan13);

        ins = new JButton("Insert");
        ins.setBounds(100, 430, 80, 20);
        frame2.add(ins);
        ins.addActionListener(this::actionPerformed);
        JButton but = new JButton("cancel");
        but.setBounds(200, 430, 80, 20);
        frame2.add(but);


        frame2.setVisible(true);
        frame2.setLayout(null);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2.setSize(500, 500);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ins) {
            System.out.println("called");
            int Roll = Integer.parseInt(tf1.getText());
            String name = tf2.getText();
            int age = Integer.parseInt(tf3.getText());
            String gender = tf4.getText();
            String address = tf5.getText();
            int mark1 = Integer.parseInt(tf6.getText());
            int mark2 = Integer.parseInt(tf7.getText());
            int mark3 = Integer.parseInt(tf8.getText());
            int mark4 = Integer.parseInt(tf9.getText());
            int mark5 = Integer.parseInt(tf10.getText());
            double CGPA = Student.CGPACalculate(mark1, mark2, mark3, mark4, mark5);

            System.out.println(Roll + name + age + gender + address + mark1 + mark2 + mark3 + mark4 + mark5 + CGPA);

        }
    }
}

