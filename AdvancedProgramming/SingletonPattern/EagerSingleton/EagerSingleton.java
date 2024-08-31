package AdvancedProgramming.SingletonPattern.EagerSingleton;

public class EagerSingleton {
    private static EagerSingleton instance;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        if (instance == null) {
            instance = new EagerSingleton();
        }
        return instance;
    }
}
