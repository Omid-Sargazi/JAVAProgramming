package AdvancedProgramming.FactoryPattern.ButtonFactory;

public class MacOSButton implements Button {
    @Override
    public void draw() {
        System.out.println("MacOS Button Draw");

    }

    @Override
    public void click() {
        System.out.println("MacOS Button Clicked");

    }
}
