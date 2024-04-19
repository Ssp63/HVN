import java.io.*;

public class DisplayFileInfo {
    public static void main(String[] args) {
        File file = new File("source.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName()); // Display file name
            System.out.println("File size: " + file.length() + " bytes"); // Display file size
            System.out.println("File path: " + file.getAbsolutePath()); // Display file path
            System.out.println("File readable: " + file.canRead()); // Check if file is readable
            System.out.println("File writable: " + file.canWrite()); // Check if file is writable
            System.out.println("File executable: " + file.canExecute()); // Check if file is executable
        } else {
            System.out.println("File does not exist.");
        }
    }
}
