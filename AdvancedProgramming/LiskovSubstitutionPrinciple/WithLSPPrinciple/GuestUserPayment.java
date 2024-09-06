package AdvancedProgramming.LiskovSubstitutionPrinciple.WithLSPPrinciple;

public class GuestUserPayment implements NewPayment {
    String name;

    public GuestUserPayment() {
        this.name = name;
    }

    @Override
    public void newPayment() {
        throw new UnsupportedOperationException();
    }
}
