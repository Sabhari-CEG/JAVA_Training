package com.sabhari;

import java.io.Serializable;

public abstract class Person implements Serializable {
    protected String name;
    protected int age;
    protected double height;
    protected double weight;

    protected Person(){

    }

    protected Person(String name,int age,double height,double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }


    public abstract String toString();

}

