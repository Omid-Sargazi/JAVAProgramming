package AdvancedProgramming.AbstractFactoryPattern.ThemeFactory;

public class YelloThemeFactory implements ThemeFactory {
    @Override
    public Theme createTheme() {
        return new YellowTheme();
    }
}
