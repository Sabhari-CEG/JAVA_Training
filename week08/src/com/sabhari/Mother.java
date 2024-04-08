package com.sabhari;

public class Mother extends Thread {
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Mother is Placing the  dosa in plate");
            Plate.plateHolder[i] = i+1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
    


}
