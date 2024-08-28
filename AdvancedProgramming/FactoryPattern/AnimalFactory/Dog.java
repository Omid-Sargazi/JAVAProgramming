package AdvancedProgramming.FactoryPattern.AnimalFactory;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
