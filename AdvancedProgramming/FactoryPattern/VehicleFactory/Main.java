package AdvancedProgramming.FactoryPattern.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle1 = vehicleFactory.getVehicle("car");
        vehicle1.start();
    }
}
