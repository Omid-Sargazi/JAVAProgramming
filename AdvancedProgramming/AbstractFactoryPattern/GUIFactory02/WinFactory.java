package AdvancedProgramming.AbstractFactoryPattern.GUIFactory02;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
