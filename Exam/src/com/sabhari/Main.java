package com.sabhari;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(Thread.activeCount());
        //System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Thread.currentThread().getName());
        //for (int i = 0; i < 10; i++) {


        Thread t1 = new Thread(new Download());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done with downloading!!");
        //}
    }
}
