package com.sabhari;

public class ExeInt {
    public static void main(String[] args) throws InterruptedException {
        var thread = new Thread(new Intereprut());
        System.out.println(Thread.currentThread().getName());
        thread.start();
        thread.sleep(10);
        thread.interrupt();
        System.out.println(Thread.currentThread().getName());
    }
}
