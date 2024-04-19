import java.io.*;

public class AppendToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            String textToAppend = "This text is appended to the file.";
            writer.write(textToAppend); // Append text to file
            System.out.println("Text appended to file successfully.");
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        }
    }
}
