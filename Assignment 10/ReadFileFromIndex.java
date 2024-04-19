import java.io.*;

public class ReadFileFromIndex {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("destination.txt")) {
            fis.skip(10); // Skip first 10 bytes
            int data;
            while ((data = fis.read()) != -1) { // Read from file
                System.out.print((char) data); // Convert bytes to characters and display
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        }
    }
}
