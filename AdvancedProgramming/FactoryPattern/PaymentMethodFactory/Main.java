package AdvancedProgramming.FactoryPattern.PaymentMethodFactory;

public class Main {
    public static void main(String[] args) {
        PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
        PaymentMethod pay1 = paymentMethodFactory.getPaymentMethod("CREDITcARD");
        pay1.pay();
    }
}
