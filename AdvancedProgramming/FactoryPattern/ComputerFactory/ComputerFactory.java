package AdvancedProgramming.FactoryPattern.ComputerFactory;

public class ComputerFactory {
    public Computer getComputer(String computerType) {
        if (computerType.equalsIgnoreCase("LAPTOP")) {
            return new Laptop();
        } else if (computerType.equalsIgnoreCase("desktop")) {
            return new Desktop();
        }
        return null;
    }
}
