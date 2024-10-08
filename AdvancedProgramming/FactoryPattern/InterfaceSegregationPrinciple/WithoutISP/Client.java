package AdvancedProgramming.FactoryPattern.InterfaceSegregationPrinciple.WithoutISP;

public class Client {
    public static void main(String[] args) {
        System.out.println("***A demo without ISP.***");
        Printer printer = new AdvancedPrinter();

        printer.printDocument();
        printer.sendFax();

        printer = new BasicPrinter();
        printer.printDocument();
        printer.sendFax();
    }
}
