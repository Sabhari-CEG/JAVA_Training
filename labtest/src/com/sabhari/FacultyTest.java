package com.sabhari;

import java.util.Scanner;

public class FacultyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Teaching faculty department and faculty name with his designation and salary");
        String department = input.next();
        String name = input.next();
        String designation = input.next();
        double salary = input.nextDouble();
        TeachingFaculty tf1 = new TeachingFaculty(department,name,designation,salary);
        System.out.println(tf1.toString());
        System.out.println("The bonus amount for this faculty is = "+tf1.calculateBouns());

        System.out.println("Enter teaching faculty name and experience with designation and salary");
        department = input.next();
        double experience = input.nextDouble();
        designation = input.next();
        salary = input.nextDouble();
        TeachingFaculty tf2 = new TeachingFaculty(department,experience,designation,salary);
        System.out.println(tf2.toString());
        System.out.println("The bonus amount for this faculty is = "+tf2.calculateBouns());

        System.out.println("Enter department name and faculty name with their designation , wages per day and no of days of work");
        department = input.next();
        name = input.next();
        designation = input.next();
        double wagesPerday = input.nextDouble();
        int noOfDays = input.nextInt();
        NonTeachingFaculty ntf1 = new NonTeachingFaculty(department,name,designation,wagesPerday,noOfDays);
        System.out.println(ntf1.toString());
        System.out.println("The bonus amount for this faculty = "+ntf1.calculateBouns());

        System.out.println("Enter faculty name and experience with their designation , wages per day and no of days of work");
        name = input.next();
        experience = input.nextDouble();
        designation = input.next();
        wagesPerday = input.nextDouble();
        noOfDays = input.nextInt();
        NonTeachingFaculty ntf2 = new NonTeachingFaculty(name,experience,designation,wagesPerday,noOfDays);
        System.out.println(ntf2.toString());
        System.out.println("The bonus amount for this faculty = "+ntf2.calculateBouns());
    }
}
