package AdvancedProgramming.SingletonPattern.ThreadSafeSingleton;

public class Main {
    public static void main(String[] args) {
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
        System.out.println(instance1 == instance2); // Output: true
    }
}
