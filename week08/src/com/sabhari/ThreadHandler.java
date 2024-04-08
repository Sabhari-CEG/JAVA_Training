package com.sabhari;

import java.util.Scanner;

public class ThreadHandler {
    public static void main(String[] args){
        Mother thread1 = new Mother();
        Child thread2 = new Child();
        thread1.start();
        try {
            thread1.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
