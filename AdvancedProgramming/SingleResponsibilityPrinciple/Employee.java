package AdvancedProgramming.SingleResponsibilityPrinciple;

import java.util.Random;

public class Employee {
    public String fName, Lname, empId;
    public double experienceInYears;

    public Employee(String fName, String Lname, double experienceInYears) {
        this.fName = fName;
        this.Lname = Lname;
        this.experienceInYears = experienceInYears;
    }

    public void displayEmployeeDetail() {
        System.out.println("Employee Name: " + Lname + ", " + fName);
        System.out.println("Experience: " + experienceInYears + " years");
    }

    public void checkSeniority(double experienceInYears) {
        return experienceInYears > 5 ? "Senior" : "junior";
    }

    public String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        empId = empFirstName.substring(0, 1) + random;
        return empId;
    }
}
