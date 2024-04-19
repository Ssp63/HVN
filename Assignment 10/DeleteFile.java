import java.io.*;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("output.txt");
        if (file.delete()) { // Delete file
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
