package AdvancedProgramming.AbstractFactoryPattern.ThemeFactory;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Theme createTheme() {
        return new DarkTheme();
    }
}
