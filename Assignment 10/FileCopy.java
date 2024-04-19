import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Create input and output streams for source and destination files
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {

            // Initialize a buffer to read data in chunks
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read data from source file until end of file is reached
            while ((bytesRead = fis.read(buffer))!= -1) {
                // Write the read data to the destination file
                fos.write(buffer, 0, bytesRead);
            }

            // Print success message upon completion
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            // Handle any IOExceptions that may occur during file I/O operations
            e.printStackTrace();
        }
    }
}