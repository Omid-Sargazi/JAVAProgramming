package AdvancedProgramming.FactoryPattern.AnimalFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimal("cat");
        animal1.sound();
    }
}
