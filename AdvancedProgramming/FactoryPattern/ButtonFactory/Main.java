package AdvancedProgramming.FactoryPattern.ButtonFactory;

public class Main {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = new ButtonFactory();
        Button button1 = buttonFactory.getButton("windows");
        button1.click();
    }
}
