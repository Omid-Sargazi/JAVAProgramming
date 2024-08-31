package AdvancedProgramming.SingletonPattern.EagerSingleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance1 == instance2); // Output: true
    }
}
