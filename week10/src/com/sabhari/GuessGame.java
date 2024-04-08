package com.sabhari;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Gameplay{
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
    }
}
public class GuessGame extends JFrame implements ActionListener {
    JTextField tf1;
    JLabel lab3;
    JPanel pan3;
    JButton done,res;
    int random,given;
    String sample;
    public GuessGame() {
        random = (int)(Math.random() * 1000);
        JLabel lab1 = new JLabel("Welcome to Guess Game");
        JPanel pan1 = new JPanel();
        pan1.add(lab1);
        pan1.setBounds(100,5,300,20);
        add(pan1);
        JLabel lab2 = new JLabel("Please Enter your guess");
        JPanel pan2 = new JPanel();
        pan2.add(lab2);
        pan2.setBounds(100,50,300,20);
        add(pan2);
        tf1 = new JTextField();
        tf1.setBounds(200,100,100,20);
        add(tf1);
        done = new JButton("Submit");
        done.setBounds(75,150,80,20);
        done.setBackground(Color.yellow);
        add(done);
        res = new JButton("Reset");
        res.setBounds(350,150,80,20);
        res.setBackground(Color.yellow);
        add(res);
        lab3 = new JLabel("Result will appear here");
        pan3 = new JPanel();
        pan3.add(lab3);
        pan3.setBounds(100,200,300,20);
        add(pan3);
        done.addActionListener(this :: actionPerformed);
        res.addActionListener(this::actionPerformed);
        setLayout(null);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
        setSize(500,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==done){
            System.out.println(random);
            sample = tf1.getText();
            given = Integer.parseInt(sample);
            int diff = random - given;
            if (diff == 0){
                lab3.setText("Awesome! You had guessed my number!");
                this.getContentPane().setBackground(Color.green);
            }
            else if(diff > 50){
                lab3.setText("you are too low");
                this.getContentPane().setBackground(Color.blue);
            }
            else if (diff > 0){
                lab3.setText("You are little lesser than my value");
                this.getContentPane().setBackground(Color.blue);
            }
            else if(diff > -50){
                lab3.setText("You are little greater than my value");
                this.getContentPane().setBackground(Color.orange);
            }
            else{
                lab3.setText("You are too high");
                this.getContentPane().setBackground(Color.red);
            }
        }
        if (e.getSource()==res){
            tf1.setText("");
            lab3.setText("Another chance");
        }
    }
}
