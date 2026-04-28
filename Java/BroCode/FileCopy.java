import java.io.*;


public class FileCopy {
    public static void main(String[] args) {
        // Define the source and destination file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Try-with-resources automatically closes the streams
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            
            // Read line by line until the end of the file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                
                // readLine() strips the newline character, so we add it back
                writer.newLine(); 
            }
            
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}