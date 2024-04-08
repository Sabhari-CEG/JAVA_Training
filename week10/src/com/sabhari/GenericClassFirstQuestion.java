package com.sabhari;

import java.util.Scanner;

public class GenericClassFirstQuestion {
    public static <E extends Comparable<E>> boolean isEqual(E formalParameter1, E formalParameter2){
        return (formalParameter1.compareTo(formalParameter2)) == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The equality between the first and the second integer is "+GenericClassFirstQuestion.isEqual(num1,num2));
        System.out.println("Enter two float");
        float no1 = input.nextFloat();
        float no2 = input.nextFloat();
        System.out.println("The equality between the first and the second floating point number is "+GenericClassFirstQuestion.isEqual(no1,no2));
        System.out.println("Enter two strings");
        String str1 = input.next();
        String str2 = input.next();
        System.out.println("The equality between the first and the second String is "+GenericClassFirstQuestion.isEqual(str1,str2));
        System.out.println("We have created an object for storing integers, Enter two integers for it");
        int obj1 = input.nextInt();
        int obj2 = input.nextInt();
        IntegerHolder integer1 = new IntegerHolder(obj1);
        IntegerHolder integer2 = new IntegerHolder(obj2);
        System.out.println("The equality between objects is " + GenericClassFirstQuestion.isEqual(integer1.getValue(),integer2.getValue()));

    }
}
