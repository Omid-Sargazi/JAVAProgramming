package AdvancedProgramming.AbstractFactoryPattern.FurnitureFactory;

public class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Table cerateTable() {
        return new ModernTable();
    }

}
