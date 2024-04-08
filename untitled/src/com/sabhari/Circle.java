package com.sabhari;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float rad;
            System.out.println("Enter the radius of the circle\n");
            rad = input.nextFloat();
            System.out.printf("The diameter of the above circle is %f\n",2*rad);
            System.out.printf("The circumference of the circle is %f\n",2*3.14*rad);
            System.out.printf("The area  of the circle is %f\n",3.14*rad*rad);
    }
}


