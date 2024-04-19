import java.io.*;

public class WriteBytesToFile {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("source.txt")) {
            String content = "Hello, world!";
            byte[] bytes = content.getBytes();
            fos.write(bytes); // Write bytes to file
            System.out.println("Bytes written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        }
    }
}
