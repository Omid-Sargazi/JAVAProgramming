package AdvancedProgramming.AbstractFactoryPattern.GUIFactory;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOS Button Clicked");
    }
}
