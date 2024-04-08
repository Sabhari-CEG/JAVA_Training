package com.sabhari;

public abstract class DepartmentFaculty {
    String departmentName;
    String facultyName;
    double yearsOfExperirnce;

    DepartmentFaculty(String departmentName,String facultyName){
        this.departmentName = departmentName;
        this.facultyName = facultyName;
        this.yearsOfExperirnce = 10.8;
    }

    DepartmentFaculty(String facultyName,double yearsOfExperirnce){
        this.departmentName = "Computer";
        this.facultyName = facultyName;
        this.yearsOfExperirnce = yearsOfExperirnce;
    }
    @Override
    public String toString(){
        String result = "Name of the department = "+this.departmentName+"\nFaculty name = "+this.facultyName+"\nYears of experience = "+this.yearsOfExperirnce;
        return result;
    }

}
