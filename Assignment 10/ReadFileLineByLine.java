import java.io.*;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) { // Read file line by line
                System.out.println(line); // Display each line
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        }
    }
}
