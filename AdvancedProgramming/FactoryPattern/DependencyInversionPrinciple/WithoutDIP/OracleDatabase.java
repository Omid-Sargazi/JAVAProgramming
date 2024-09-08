package AdvancedProgramming.FactoryPattern.DependencyInversionPrinciple.WithoutDIP;

public class OracleDatabase {
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id: " + empId + " is saved in the Oracle database.");
    }
}
