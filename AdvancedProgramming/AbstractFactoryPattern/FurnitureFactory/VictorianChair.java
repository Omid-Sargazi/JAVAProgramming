package AdvancedProgramming.AbstractFactoryPattern.FurnitureFactory;

public class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Victorian chair sits.");
    }
}
