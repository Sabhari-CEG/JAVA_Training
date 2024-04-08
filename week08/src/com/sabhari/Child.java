package com.sabhari;

public class Child extends Thread {
    public void run(){
        System.out.println("The child is counting the number of dosa and printing its number");
        int plateSize = Plate.plateHolder.length;
        for (int i = 0; i < plateSize ; i++) {

                System.out.println("Child reads Dosa number " + Plate.plateHolder[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
