package AdvancedProgramming.FactoryPattern.InterfaceSegregationPrinciple.WithISP;

public class AdvancedPrinter implements Printer, FaxDevice {
    @Override
    public void printDocument() {
        System.out.println("Printing a document");
    }

    @Override
    public void sendFax() {
        System.out.println("Sending a fax");
    }
}
