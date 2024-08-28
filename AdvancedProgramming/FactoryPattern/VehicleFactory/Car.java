package AdvancedProgramming.FactoryPattern.VehicleFactory;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}
