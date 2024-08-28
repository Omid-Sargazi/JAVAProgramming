package AdvancedProgramming.FactoryPattern.FoodFactory;

public class FoodFactory {
    public Food getFood(String foodType) {
        if (foodType.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (foodType.equalsIgnoreCase("BURGER")) {
            return new Burger();
        }
        return null;
    }
}
