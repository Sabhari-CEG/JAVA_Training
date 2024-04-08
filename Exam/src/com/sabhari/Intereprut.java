package com.sabhari;

public class Intereprut implements Runnable{
    @Override
    public void run() {
        System.out.println("downloading!! " + Thread.currentThread().getName());
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) break;
            System.out.println(i);

        }
    }
}
