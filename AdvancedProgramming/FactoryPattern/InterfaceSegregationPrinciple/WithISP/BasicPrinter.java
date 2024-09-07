package AdvancedProgramming.FactoryPattern.InterfaceSegregationPrinciple.WithISP;

public class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Printing a document");
    }
}
