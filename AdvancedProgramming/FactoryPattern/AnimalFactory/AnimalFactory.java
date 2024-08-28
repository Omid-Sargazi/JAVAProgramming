package AdvancedProgramming.FactoryPattern.AnimalFactory;

public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        return null;
    }
}
