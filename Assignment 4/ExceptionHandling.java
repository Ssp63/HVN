public class ExceptionHandling {

    /**
     * This method demonstrates handling different types of exceptions in Java.
     */
    public static void main(String[] args) {

        // Divide by Zero
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        // Array Index Out Of Bound
        try {
            int[] arr = new int[5];
            int value = arr[10]; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }

        // Number Format
        try {
            int num = Integer.parseInt("abc"); // This will throw a NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        // Null Pointer
        try {
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
}