package AdvancedProgramming.AbstractFactoryPattern.GUIFactory02;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOS Button Clicked");
    }
}
