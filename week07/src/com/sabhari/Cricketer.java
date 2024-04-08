package com.sabhari;

import java.io.Serializable;

public class Cricketer extends Person implements Serializable {
    protected String countryName;
    protected String role;
    protected int noOfWickets;
    protected int noOfRuns;

    public Cricketer() {

    }

    @Override
    public String toString() {
        String cric = "Cricketer info\nName : " + this.name + "\nAge : " + this.age + "\nHeight : " + this.height + "\nWeight : " + this.weight + "Country Name : " + this.countryName + "\nRole : " + this.role + "\nNumber of wickets : " + this.noOfWickets + "\nNumber of runs : " + this.noOfRuns;
        return cric;
    }



    public Cricketer(String name, int age, double height, double weight, String countryName, String role, int noOfWickets, int noOfRuns) {
        super(name, age, height, weight);
        this.countryName = countryName;
        this.role = role;
        this.noOfWickets = noOfWickets;
        this.noOfRuns = noOfRuns;

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    public String getCountryName() {
        return countryName;
    }

    public String getRole() {
        return role;
    }

    public int getNoOfRuns() {
        return noOfRuns;
    }

    public int getNoOfWickets() {
        return noOfWickets;
    }
}


