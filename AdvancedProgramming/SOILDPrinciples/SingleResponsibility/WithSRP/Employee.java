package AdvancedProgramming.SOILDPrinciples.SingleResponsibility.WithSRP;

public class Employee {
    public String firstName, lastName, empId;
    public double experienceInYears;

    public Employee(String fString, String lastName, double experience) {
        this.firstName = fString;
        this.lastName = lastName;
        this.experienceInYears = experience;
    }

    public void displayEmpDetail() {
        System.out.println("The employee name: " + "+lastName+" + firstName);
        System.out.println("This employee has" + experienceInYears + " years of experience.");
    }
}
