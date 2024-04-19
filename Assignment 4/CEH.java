class SpeedLimitExceededException extends Exception {
    public SpeedLimitExceededException(String message) {
        super(message);
    }
}

public class CEH {
    public static void main(String[] args) {
        try {
            int speed = 130;
            if (speed > 120) {
                throw new SpeedLimitExceededException("Speed Limit Exceeded");
            } else {
                System.out.println("Under speed limit");
            }
        } catch (SpeedLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
