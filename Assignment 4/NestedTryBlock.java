public class NestedTryBlock {
    public static void main(String[] args) {
        // Outer try block to catch any unhandled exceptions
        try {
            // Inner try block to handle ArithmeticException
            try {
                int result = 10 / 0; // Attempt to divide by zero
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            // Inner try block to handle ArrayIndexOutOfBoundsException
            try {
                int[] arr = new int[5];
                int value = arr[10]; // Attempt to access an index out of bounds
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound");
            }
        }
        // Catch block to handle any unhandled exceptions from the outer try block
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}