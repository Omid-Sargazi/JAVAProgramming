package AdvancedProgramming.AbstractFactoryPattern.ThemeFactory;

public class DarkTheme implements Theme {
    @Override
    public void apply() {
        System.out.println("Applying Dark Theme");
    }
}
