package AdvancedProgramming.FactoryPattern.ToyFactory;

public class Mian {
    public static void main(String[] args) {
        ToyFactory toyFactory = new ToyFactory();
        Toy car = toyFactory.geToy("car");
        car.play();
    }
}
