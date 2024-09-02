package AdvancedProgramming.AbstractFactoryPattern.AnimalFactory;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
