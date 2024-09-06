package AdvancedProgramming.LiskovSubstitutionPrinciple;

public class GuestUserPayment implements Payment {
    String name;

    public GuestUserPayment() {
        this.name = name;
    }

    @Override
    public void previousPaymentInfo() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
    }
}
