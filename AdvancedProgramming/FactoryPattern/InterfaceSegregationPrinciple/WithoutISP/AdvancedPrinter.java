package AdvancedProgramming.FactoryPattern.InterfaceSegregationPrinciple.WithoutISP;

public class AdvancedPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Printing a document");
    }

    @Override
    public void sendFax() {
        System.out.println("Sending a fax");
    }
}
