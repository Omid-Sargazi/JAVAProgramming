package AdvancedProgramming.AbstractFactoryPattern.ThemeFactory;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Theme createTheme() {
        return new LightTheme();
    }
}
