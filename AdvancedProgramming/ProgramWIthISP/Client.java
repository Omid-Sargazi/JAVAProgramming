package AdvancedProgramming.ProgramWIthISP;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** A demo that follows the SRP.***");
        Employee robin = new Employee("Robin", "Smith", 7.5);
        showEmpDetail(robin);

        Employee kevin = new Employee("Albert", "Samii", 6.2);

        showEmpDetail(kevin);
    }

    private static void showEmpDetail(Employee emp) {
        emp.displayEmpDetail();
        EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();
        String empId = idGenerator.generateEmpId(emp.fName);
        System.out.println("The employee id: " + empId);

        SeniorityChecker seniorityChecker = new SeniorityChecker();
    }
}
