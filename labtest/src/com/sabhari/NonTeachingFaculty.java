package com.sabhari;

public class NonTeachingFaculty extends DepartmentFaculty implements Bonus{
    String designation;
    double wagesPerDay;
    int noOfDays;

    NonTeachingFaculty(String facultyName, double yearsOfExperirnce,String designation,double wagesPerDay,int noOfDays) {
        super(facultyName, yearsOfExperirnce);
        this.designation = designation;
        this.wagesPerDay = wagesPerDay;
        this.noOfDays = noOfDays;
    }
    NonTeachingFaculty(String departmentName,String facultyName,String designation,double wagesPerDay,int noOfDays){
        super(departmentName, facultyName);
        this.designation = designation;
        this.wagesPerDay = wagesPerDay;
        this.noOfDays = noOfDays;
    }

    public double calculateSalary(double wagesPerDay,int noOfDays){
        double salary = wagesPerDay*noOfDays;
        return salary;
    }
    double salary;
    @Override
    public String toString(){
         salary = calculateSalary(wagesPerDay, noOfDays);
        String result = "Name of the department = "+super.departmentName+"\nFaculty name = "+super.facultyName+
                "\nYears of experience = "+super.yearsOfExperirnce+"\nDesignation = "+this.designation+
                "\nWages per day ="+this.wagesPerDay+"\nNo of days = "+this.noOfDays+"salary = "+salary;
        return result;
    }

    @Override
    public double calculateBouns() {
        double bonus = salary * 0.25;
        double newSalary = salary + bonus;
        return newSalary;
    }
}
