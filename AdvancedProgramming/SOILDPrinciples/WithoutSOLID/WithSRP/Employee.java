package AdvancedProgramming.SOILDPrinciples.WithoutSOLID.WithSRP;

public class Employee {
    public String firstName, lastName, empId;
    public double experienceInYears;

    public Employee(String firstName, String lastName, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experience;
    }

    public void displayEmpDetail() {
        System.out.println("The employee name: " + lastName + "," + firstName);
        System.out.println("This employee has " + experienceInYears + " years of experience.");
    }
}
