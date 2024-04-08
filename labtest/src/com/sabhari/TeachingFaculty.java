package com.sabhari;

public class TeachingFaculty extends DepartmentFaculty implements Bonus{
    String designation;
    double salary;

    TeachingFaculty(String departmentName, String facultyName,String designation,double salary) {
        super(departmentName, facultyName);
        this.designation = designation;
        this.salary = salary;
    }
    TeachingFaculty(String facultyName,double yearsOfExperience,String designation,double salary){
        super(facultyName,yearsOfExperience);
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString(){
        String result = "Name of the department = "+super.departmentName+"\nFaculty name = "+super.facultyName+"\nYears of experience = "+super.yearsOfExperirnce+"\nDesignation = "+this.designation+"\nSalary ="+this.salary;
        return result;
    }

    @Override
    public double calculateBouns() {
        double bonus = salary * 0.10;
        double newSalary = salary + bonus;
        return newSalary;
    }
}
