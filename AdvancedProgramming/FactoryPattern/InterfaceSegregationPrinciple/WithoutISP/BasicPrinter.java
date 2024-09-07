package AdvancedProgramming.FactoryPattern.InterfaceSegregationPrinciple.WithoutISP;

public class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Printing a document");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException();
    }
}
