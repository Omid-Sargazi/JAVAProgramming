package AdvancedProgramming.FactoryPattern.PaymentMethodFactory;

public class PaymentMethodFactory {
    public PaymentMethod getPaymentMethod(String methodType) {
        if (methodType.equalsIgnoreCase("CREDITCARD")) {
            return new CreditCard();
        } else if (methodType.equalsIgnoreCase("PAYPAL")) {
            return new PayPal();
        }
        return null;
    }
}
