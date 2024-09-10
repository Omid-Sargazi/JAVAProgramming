package AdvancedProgramming.SingleResponsibilityPrinciple;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** A demo without SRP.***");
        Employee robin = new Employee("Robin", "Smith", 7.5);
        showEmpDetail(robin);

        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        showEmpDetail(kevin);

    }

    private static void showEmpDetail(Employee emp) {
        emp.displayEmployeeDetail();
        System.out.println("Seniority: " + emp.checkSeniority(emp.experienceInYears));
        System.out.println("This employee is a: " + emp.generateEmpId(emp.fName));
    }
}
