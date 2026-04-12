import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileManager {

    // Method to create a file and write text
    public void createAndWrite(String fileName, String content) {
        try {
            // FileWriter creates the file if it doesn't exist
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close(); // Always close your streams!
            System.out.println("Created and wrote to: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read from one file and write to another
    public void transferData(String sourceName, String destinationName) {
        // We use BufferedReader for efficient reading line-by-line
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceName));
             FileWriter writer = new FileWriter(destinationName)) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                // line.readLine() strips the newline, so we add it back if needed
                writer.write(System.lineSeparator()); 
            }
            
            System.out.println("Data successfully transferred to: " + destinationName);
        } catch (IOException e) {
            System.out.println("Error during transfer: " + e.getMessage());
        }
    }
}

public class Practce2 {
    public static void main(String[] args) {
        FileManager manager = new FileManager();

        // Step 1: Create first file
        manager.createAndWrite("fileA.txt", "This is the original content from file A.");

        // Step 2: Transfer content to the second file
        manager.transferData("fileA.txt", "fileB.txt");
    }
}