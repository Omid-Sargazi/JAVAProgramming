package AdvancedProgramming.AbstractFactoryPattern.FurnitureFactory;

public class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Modern chair sits.");
    }
}
