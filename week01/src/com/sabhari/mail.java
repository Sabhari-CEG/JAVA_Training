package com.sabhari;

import java.util.Scanner;
public class mail {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        float weight;
        int rate;
        int extra = 0;
        int cost = 0;
        rate = 0;

        System.out.println("Enter the weight of the object");
        weight = input.nextFloat();
        while(weight>0.0) {
            rate = rate + 3;
            if(rate > 10) {
                extra = rate - 10;

            }
            cost= rate + extra;

            System.out.println("Enter the weight of the object");
            weight = input.nextFloat();
        }
        System.out.println("The final cost for the above mail is " +cost);

    }

}

