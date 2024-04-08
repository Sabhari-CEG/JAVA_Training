package com.sabhari;

import java.util.Scanner;

public class TestAccount {



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("enter number of customers");
        n = input.nextInt();
        Account[] ac = new Account[n];
        for(int i = 0;i < ac.length; i++) {
            System.out.println("Enter customer Name");
            String name = input.next();
            System.out.println("Enter customer Balance");
            double balance = input.nextDouble();
            System.out.println("Enter customer Account number");
            int acc_no = input.nextInt();
            ac[i] = new Account(name,balance,acc_no);

        }
        for (Account i:ac) {


            System.out.println("Name : " + i.getName());
            System.out.println("Balance : " + i.getBalance());
            System.out.println("Account number : " + i.getAcc_no());
        }
        double sum = Account.totalInterest(ac);
        System.out.println("The total interest of the bank is " + sum);
    }

}
