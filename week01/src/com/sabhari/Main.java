package com.sabhari;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int sub1 = Integer.parseInt(args[0]);
        if(sub1<=0){
            System.out.println("Enter Valid argument");
        }
        System.out.println(sub1);
        total = total +sub1;
        int sub2 = Integer.parseInt(args[1]);
        if(sub2<=0){
            System.out.println("Enter Valid argument");
        }
        System.out.println(sub2);
        total = total + sub2;
        int sub3 = Integer.parseInt(args[2]);
        if(sub3<=0){
            System.out.println("Enter Valid argument");
        }
        System.out.println(sub3);
        total = total + sub3;
        int sub4 = Integer.parseInt(args[3]);
        if(sub4<=0){
            System.out.println("Enter Valid argument");
        }
        System.out.println(sub4);
        total = total + sub4;
        int sub5 = Integer.parseInt(args[4]);
        if(sub5<=0){
            System.out.println("Enter Valid argument");
        }
        System.out.println(sub5);
        total = total + sub5;
        float avg = total/5;
        //System.out.printf("your average is %f",avg);

        if(avg<=100 && avg>=90)
            System.out.println("your grade is O");
        else if(avg<90 && avg>=80)
            System.out.printf("your grade is A+");
        else if(avg<80 && avg>=70)
            System.out.printf("your grade is A");
        else if(avg<70 && avg>=60)
            System.out.printf("your grade is B+");
        else if(avg<60 && avg>=50)
            System.out.printf("your grade is B+");
        else
            System.out.printf("try to attain pass grades");
    }
}
