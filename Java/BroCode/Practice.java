import java.io.*;

public class Practice {
    public static void main(String[] args) {
        FileManager file = new FileManager();
        file.createAndwrite("file1.txt", """
                My name is emon.
                I am a CSE student.
                """);
        file.copyFile("file1.txt", "test.txt");
    }
}

class FileManager {
    public void createAndwrite(String fileName, String content) {
        try{
             // FileWriter creates the file if it doesn't exist
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close(); // Always close your streams!
            System.out.println("Created and wrote to: " + fileName);
        }
        catch(IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }
    }

    public void copyFile(String fromFile, String toFile) {
          try (BufferedReader reader = new BufferedReader(new FileReader(fromFile));
             FileWriter writer = new FileWriter(toFile)) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                // line.readLine() strips the newline, so we add it back if needed
                writer.write(System.lineSeparator()); 
            }
            
            System.out.println("Data successfully transferred to: " + toFile);
        } catch (IOException e) {
            System.out.println("Error during transfer: " + e.getMessage());
        }
    }
}