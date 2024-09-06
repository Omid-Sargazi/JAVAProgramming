package AdvancedProgramming.LiskovSubstitutionPrinciple;

public class Client {
    public static void main(String[] args) {
        System.out.println("***A demo without LSP.***\n");
        PaymentHelper helper = new PaymentHelper();
        RegisteredUserPayment robinPayment = new RegisteredUserPayment("Robin");
        RegisteredUserPayment jackPayment = new RegisteredUserPayment("Jack");
        helper.addUser(robinPayment);
        helper.addUser(jackPayment);

        GuestUserPayment guestUser = new GuestUserPayment();
        helper.addUser(guestUser);

        helper.showPreviousPayments();
        helper.processNewPayments();
    }
}
