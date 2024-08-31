package AdvancedProgramming.AbstractFactoryPattern.FurnitureFactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table cerateTable() {
        // TODO Auto-generated method stub
        return new VictorianTable();

    }
}
