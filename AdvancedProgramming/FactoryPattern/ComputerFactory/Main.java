package AdvancedProgramming.FactoryPattern.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer1 = computerFactory.getComputer("laptop");
        computer1.boot();
    }
}
