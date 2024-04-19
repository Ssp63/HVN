import java.io.*;

public class DisplayFileContents {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DisplayFileContents <filename>");
            return;
        }

        String filename = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) { // Read file line by line
                System.out.println(line); // Display each line
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        }
    }
}
