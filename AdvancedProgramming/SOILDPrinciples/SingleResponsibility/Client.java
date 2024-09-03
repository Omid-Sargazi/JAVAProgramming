package AdvancedProgramming.SOILDPrinciples.SingleResponsibility;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** A demo without SRP.***");

        Employee robin = new Employee("Rabin", "Smith", 7.5);
        showEmpDetail(robin);
        System.out.println("\n*******\n");

        Employee Kevin = new Employee("Kevin", "Proctor", 3.2);
        showEmpDetail(Kevin);

    }

    private static void showEmpDetail(Employee emp) {
        emp.displayEmpDetail();
        System.out.println("The employee Id: " + emp.generateEmpId(emp.firstName));
        System.out.println("This employee is a " + emp.checkSeniority(emp.experienceInYears) + " employee");
    }
}
