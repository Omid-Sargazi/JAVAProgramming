package AdvancedProgramming.FactoryPattern.DependencyInversionPrinciple.WithoutDIP;

public class UserInterface {
    private OracleDatabase oracleDatabase;

    public UserInterface() {
        this.oracleDatabase = new OracleDatabase();
    }

    public void saveEmployeeId(String empId) {
        oracleDatabase.saveEmpIdInDatabase(empId);
    }
}
