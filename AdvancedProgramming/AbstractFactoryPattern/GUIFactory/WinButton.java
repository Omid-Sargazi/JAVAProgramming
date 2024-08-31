package AdvancedProgramming.AbstractFactoryPattern.GUIFactory;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button Clicked");
    }
}
