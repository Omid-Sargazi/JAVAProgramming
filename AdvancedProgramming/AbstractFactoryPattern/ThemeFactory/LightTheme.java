package AdvancedProgramming.AbstractFactoryPattern.ThemeFactory;

public class LightTheme implements Theme {
    @Override
    public void apply() {
        System.out.println("Applying Light Theme");
    }
}
