package AdvancedProgramming.SingletonPattern.SimpleSingleton;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton instance1 = SimpleSingleton.getInstance();
        SimpleSingleton instance2 = SimpleSingleton.getInstance();
        System.out.println(instance1 == instance2); // Output: true
    }
}
