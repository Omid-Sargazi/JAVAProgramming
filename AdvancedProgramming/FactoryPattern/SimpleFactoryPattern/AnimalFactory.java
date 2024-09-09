package AdvancedProgramming.FactoryPattern.SimpleFactoryPattern;

public class AnimalFactory {
    public Animal createAnimal(String animalType) {
        Animal animal;
        if (animalType.equals("dog")) {
            animal = new Dog();
        } else {
            System.out.println("You can create either a 'dog' or a 'tiger'. ");
            throw new IllegalArgumentException("Unknown animal cannot be instantiated.");
        }
        return animal;
    }
}
