package AdvancedProgramming.FactoryPattern.ButtonFactory;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button Clicked");

    }

    @Override
    public void draw() {
        System.out.println("Windows Button Draw");

    }
}
