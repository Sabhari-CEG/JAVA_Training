package com.sabhari;

import java.io.Serializable;

public class FootballPlayer extends Person implements Serializable {

    String teamName;
    int uniformNo;
    int noOfGoals;

    public FootballPlayer(){

    }



    public FootballPlayer(String name,int age,double height,double weight,String teamName,int uniformNo,int noOfGoals){
        super(name,age,height,weight);
        this.teamName = teamName;
        this.uniformNo = uniformNo;
        this.noOfGoals = noOfGoals;
    }

    public int getNoOfGoals() {
        return this.noOfGoals;
    }




    @Override
    public String toString() {
        String foot = "Football player info\nName : " + this.name + "\nAge : " + this.age + "\nHeight : " + this.height + "\nWeight : " + this.weight  + "\nTeam Name : " + this.teamName + "\nUniform Number : " + this.uniformNo + "\nNumber Of Goals : " + this.noOfGoals;;
        return foot;
    }
}

