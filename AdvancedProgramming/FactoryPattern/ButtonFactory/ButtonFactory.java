package AdvancedProgramming.FactoryPattern.ButtonFactory;

public class ButtonFactory {
    public Button getButton(String osType) {
        if (osType.equalsIgnoreCase("windows")) {
            return new WindowsButton();
        } else if (osType.equalsIgnoreCase("MACOS")) {
            return new MacOSButton();
        }
        return null;
    }
}
