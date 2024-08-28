package AdvancedProgramming.FactoryPattern.FoodFactory;

public class Main {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Food food1 = foodFactory.getFood("pizza");
        food1.eat();
    }
}
