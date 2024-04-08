package com.sabhari;

public class Account {
    private String name;
    private double balance;
    private int acc_no;

    private static final float rateOfInterest = 0.05f;
    private static double interest;



    public Account() {

    }

    //Creating a instance with  overloaded constructor
    public  Account(String n,double bal,int acc){
        this.name = n;
        this.balance = bal;
        this.acc_no = acc;
    }

    //creating the instance with Set method
    public void setName(String n){
        //No static because it creates an instance of the class Account
        this.name = n;
    }

    public void setBalance(double bal){
        this.balance = bal;
    }

    public void setAcc_no(int acc){
        this.acc_no = acc;
    }

    //viewing the instance with get method
    public String getName(){
        return (this.name);
    }

    public double getBalance(){
        return (this.balance);
    }
    public int getAcc_no(){
        return (this.acc_no);
    }

    public static double totalInterest(Account[] ac){
        double sum = 0;

        for(int i=0; i<ac.length;i++) {
            interest = ac[i].balance * rateOfInterest;
            sum += interest;
            System.out.println("The interest for the customer " + ac[i].name + " With Account number " + ac[i].acc_no +" is " + interest);
        }
        return sum;

    }

}
