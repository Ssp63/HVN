// CustomException class extends the Exception class to create a custom exception
import java.lang.*;
class CustomException extends Exception {
    // Constructor that takes an error message as a parameter
    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}

public class CustomExceptionHandling {
    public static void main(String[] args) {
        // Try block to enclose the code that might throw an exception
        try {
            // // Initialize an integer variable 'age' with a value of 17
            // int age = 17;
            // // Check if the age is less than 18
            // if (age < 18) {
                // Throw a new CustomException with an error message
                throw new CustomException("You must be 18 years or older.");
            
        }
        // Catch block to handle the CustomException
        catch (CustomException e) {
            // Print the error message of the CustomException
            System.out.println(e.getMessage());
        }

        catch (Exception e){
            System.out.println("in exception" + e.getMessage());
        }
    }
}