package AdvancedProgramming.FactoryPattern.PaymentMethodFactory;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with Credit Card");

    }
}
