// This class demonstrates the use of the finally keyword in Java
public class FinallyKeyword {
    public static void main(String[] args) {
        // This try block contains code that may throw an exception
        try {
            int result = 10 / 0; // This line will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // This catch block will execute if an ArithmeticException is thrown
            System.out.println("Cannot divide by zero");
        } finally {
            // This finally block will always execute, regardless of whether an exception is thrown
            System.out.println("Finally block always executes");
        }
    }
}