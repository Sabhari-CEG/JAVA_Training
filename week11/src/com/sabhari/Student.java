package com.sabhari;

public class Student {

    int RollNo;
    String name;
    int age;
    String gender;
    String address;
    int mark1,mark2,mark3,mark4,mark5;
    double CGPA;

    public Student(int RollNo,String name,int age,String gender,String address,int mark1,int mark2,int mark3,int mark4,int mark5){
        this.RollNo = RollNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
        this.CGPA = CGPACalculate(mark1,mark2,mark3,mark4,mark5);
    }

    public static double CGPACalculate(int mark1,int mark2,int mark3,int mark4,int mark5){
        double CGPA = 0.0;
        CGPA = (mark1*5 + mark2*5 + mark3*5 + mark4*5 + mark5*5)/25;
        CGPA = CGPA/10;
        return  CGPA;
    }
}
