package AdvancedProgramming.FactoryPattern.SimpleFactoryPattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Simple Factory Demonstration.***");
        AnimalFactory factory = new AnimalFactory();
        Animal animal = factory.createAnimal("dog");
        animal.displayBehavior();
        animal = factory.createAnimal("tiger");
        animal.displayBehavior();
    }
}
