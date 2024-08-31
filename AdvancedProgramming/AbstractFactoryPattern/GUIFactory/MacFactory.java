package AdvancedProgramming.AbstractFactoryPattern.GUIFactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
