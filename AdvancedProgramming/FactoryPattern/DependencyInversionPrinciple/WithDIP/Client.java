package AdvancedProgramming.FactoryPattern.DependencyInversionPrinciple.WithDIP;

public class Client {
    public static void main(String[] args) {
        System.out.println("***A demo that follows the DIP.***");

        Database database = new MySQLDatabase();
        UserInterface userInterface = new UserInterface(database);
        userInterface.saveEmployeeId("E001");
        database = new MySQLDatabase();
        userInterface = new UserInterface(database);
        userInterface.saveEmployeeId("E002");
    }
}
