package AdvancedProgramming.ProgramWIthISP;

public class Employee {
    public String fName, lName, empId;
    public double experienceInYears;

    public Employee(String fName, String lName, double experienceInYears) {
        this.fName = fName;
        this.lName = lName;
        this.experienceInYears = experienceInYears;
    }

    public void displayEmpDetail() {
        System.out.println("Employee Name: " + lName + ", " + fName);
        System.out.println("Experience: " + experienceInYears + " years");
    }
}
