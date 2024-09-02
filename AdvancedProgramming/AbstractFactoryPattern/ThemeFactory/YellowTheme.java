package AdvancedProgramming.AbstractFactoryPattern.ThemeFactory;

public class YellowTheme implements Theme {
    @Override
    public void apply() {
        System.out.println("Applying Dark Theme");
    }
}
