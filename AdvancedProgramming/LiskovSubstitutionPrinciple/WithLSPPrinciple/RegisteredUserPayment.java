package AdvancedProgramming.LiskovSubstitutionPrinciple.WithLSPPrinciple;

public class RegisteredUserPayment implements NewPayment, PreviousPayment {
    String name;

    public RegisteredUserPayment(String name)

    {
        this.name = name;
    }

    public void previousPaymentInfo() {
        System.out.println("Retrieving " + name + "'s last payment details.");
    }

    @Override
    public void newPayment() {
        System.out.println("Processing new payment for " + name + ".");
    }
}
