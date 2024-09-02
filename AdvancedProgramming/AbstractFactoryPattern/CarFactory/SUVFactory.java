package AdvancedProgramming.AbstractFactoryPattern.CarFactory;

public class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }
}
