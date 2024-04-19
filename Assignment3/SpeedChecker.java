
public class SpeedChecker {

    //SPEED_LIMIT is a public constant variable that stores the maximum allowed speed.
    public static final int SPEED_LIMIT = 100;

    // The main method is the entry point of the program. It initializes the current speed and checks if it exceeds the speed limit.
    public static void main(String[] args) {
        //currentSpeed is an integer variable that stores the current speed of the vehicle.
        int currentSpeed = 110;

        // Conditional statement comment: This if-else statement checks if the current speed exceeds the speed limit.
        if (currentSpeed > SPEED_LIMIT) {
            // System.out.println comment: This line prints an alert message if the speed limit is exceeded.
            System.out.println("Alert: Speed limit exceeded! Current speed is " + currentSpeed);
        } else {
            // System.out.println comment: This line prints a confirmation message if the speed is within the limit.
            System.out.println("Speed is within the limit. Current speed is " + currentSpeed);
        }
    }
}