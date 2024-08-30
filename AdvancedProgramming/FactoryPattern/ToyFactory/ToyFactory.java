package AdvancedProgramming.FactoryPattern.ToyFactory;

public class ToyFactory {
    public Toy geToy(String toyType) {
        if (toyType.equalsIgnoreCase("car")) {
            return new CarToy();
        } else if (toyType.equalsIgnoreCase("doll")) {
            return new DollToy();
        }
        return null;
    }
}
