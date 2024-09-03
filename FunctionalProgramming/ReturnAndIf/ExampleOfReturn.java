package FunctionalProgramming.ReturnAndIf;

public class ExampleOfReturn {
    public static void main(String[] args) {
        System.out.println("Test");
        ExampleOfReturn exampleOfReturn = new ExampleOfReturn();
        System.out.println(exampleOfReturn.Recursive(10));
    }

    public int Recursive(int start) {
        if (start <= 0) {
            return 1000;
        }
        System.out.println(start);
        Recursive(start - 1);
        return start;
    }
}
