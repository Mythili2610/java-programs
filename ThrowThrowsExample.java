import java.util.*;
public class ThrowThrowsExample {

    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0); // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}