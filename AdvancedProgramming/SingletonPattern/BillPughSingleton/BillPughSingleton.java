package AdvancedProgramming.SingletonPattern.BillPughSingleton;

public class BillPughSingleton {
    private static BillPughSingleton instance;

    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        if (instance == null) {
            instance = new BillPughSingleton();
        }
        return instance;
    }
}
