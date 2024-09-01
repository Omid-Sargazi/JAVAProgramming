package AdvancedProgramming.AbstractFactoryPattern.GUIFactory02;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
