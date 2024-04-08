package com.sabhari;

import java.util.Scanner;

public class GenericSecondQuestion<F,S> {
    F parameter1;
    S parameter2;

    public void setParameter1(F value) {
        this.parameter1 = value;
    }

    public void setParameter2(S value1) {
        this.parameter2 = value1;
    }

    public F getParameter1() {
        return parameter1;
    }

    public S getParameter2() {
        return parameter2;
    }

    public static void main(String[] args) {
        GenericSecondQuestion<String, Integer> obj1 = new GenericSecondQuestion<String, Integer>();
        GenericSecondQuestion<String, Float> obj2 = new GenericSecondQuestion<String, Float>();
        GenericSecondQuestion<String, String> obj3 = new GenericSecondQuestion<String, String>();
        GenericSecondQuestion<Integer, Integer> obj4 = new GenericSecondQuestion<Integer, Integer>();
        GenericSecondQuestion<Integer, Float> obj5 = new GenericSecondQuestion<Integer, Float>();
        GenericSecondQuestion<Integer, String> obj6 = new GenericSecondQuestion<Integer, String>();
        GenericSecondQuestion<Float, Float> obj7 = new GenericSecondQuestion<Float, Float>();
        GenericSecondQuestion<Float, Integer> obj8 = new GenericSecondQuestion<Float, Integer>();
        GenericSecondQuestion<Float, String> obj9 = new GenericSecondQuestion<Float, String>();
        while (true) {
            int option;
            System.out.println("Select option\n1.String and integer\t2.string and float\t3.String and string");
            System.out.println("4.Integer and integer\t5.Integer and float\t6.Integer and string");
            System.out.println("7.Float and float\t8.Float and integer\t9.Float and string\t10.exit");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            if (option == 1) {
                System.out.println("Enter string and integer");
                String temp = input.next();
                int temp1 = input.nextInt();
                obj1.setParameter1(temp);
                obj1.setParameter2(temp1);
                System.out.println("You have entered");
                System.out.println(obj1.getParameter1());
                System.out.println(obj1.getParameter2());
            }
            else if (option == 2) {
                System.out.println("Enter string and float");
                String temp = input.next();
                float temp2 = input.nextFloat();
                obj2.setParameter1(temp);
                obj2.setParameter2(temp2);
                System.out.println("You have entered");
                System.out.println(obj2.getParameter1());
                System.out.println(obj2.getParameter2());
            }
            else if (option == 3) {
                System.out.println("Enter string and string");
                String temp = input.next();
                String temp1 = input.next();
                obj3.setParameter1(temp);
                obj3.setParameter2(temp1);
                System.out.println("You have entered");
                System.out.println(obj3.getParameter1());
                System.out.println(obj3.getParameter2());
            }

            else if (option == 4) {
                System.out.println("Enter Integer and integer");
                int temp = input.nextInt();
                int temp1 = input.nextInt();
                obj4.setParameter1(temp);
                obj4.setParameter2(temp1);
                System.out.println("You have entered");
                System.out.println(obj4.getParameter1());
                System.out.println(obj4.getParameter2());
            }
            else if (option == 5) {
                System.out.println("Enter Integer and float");
                int temp = input.nextInt();
                float temp1 = input.nextFloat();
                obj5.setParameter1(temp);
                obj5.setParameter2(temp1);
                System.out.println("You have entered");
                System.out.println(obj5.getParameter1());
                System.out.println(obj5.getParameter2());
            }
            else if (option == 6) {
                System.out.println("Enter Integer and string");
                int temp = input.nextInt();
                String temp1 = input.next();
                obj6.setParameter1(temp);
                obj6.setParameter2(temp1);
                System.out.println("You have entered");
                System.out.println(obj6.getParameter1());
                System.out.println(obj6.getParameter2());
            }
            else if (option == 7) {
                System.out.println("Enter Float and float");
                float temp = input.nextFloat();
                float temp1 = input.nextFloat();
                obj7.setParameter1(temp);
                obj7.setParameter2(temp1);
                System.out.println("You have entered");
                System.out.println(obj7.getParameter1());
                System.out.println(obj7.getParameter2());
            }
            else if (option == 8) {
                System.out.println("Enter Float and integer");
                float temp = input.nextFloat();
                int temp1 = input.nextInt();
                obj8.setParameter1(temp);
                obj8.setParameter2(temp1);
                System.out.println("You have entered");
                System.out.println(obj8.getParameter1());
                System.out.println(obj8.getParameter2());
            }
            else if (option == 9) {
                System.out.println("Enter Float and string");
                float temp = input.nextFloat();
                String temp1 = input.next();
                obj9.setParameter1(temp);
                obj9.setParameter2(temp1);
                System.out.println("You have entered");
                System.out.println(obj9.getParameter1());
                System.out.println(obj9.getParameter2());
            }
            else if(option == 10){
                break;
            }
        }
    }

}
