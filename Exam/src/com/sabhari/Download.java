package com.sabhari;

public class Download implements Runnable {
    @Override
    public void run() {
        System.out.println("downloading!! " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("download completed!! " + Thread.currentThread().getName());
    }
}
