package AdvancedProgramming.AbstractFactoryPattern.CarFactory;

public class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}
