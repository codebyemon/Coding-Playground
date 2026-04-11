import java.io.*;
public class file1 {
    public static void main(String[]args){
        // How to write a file using Java
        
        // FileWriter = Good for small or medium-sized text files
        // BuffereWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOuntputStream = Best for binary files (e.g., images, audio, files)

        String fileName = "test.txt";
        String textContent = """
                Roses are Red
                Violets are Blue
                Booty booty booty
                rockin everwhere
                """;;
        
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(textContent);
            System.out.println("File has been written.");

        }
        catch(FileNotFoundException e){
            System.err.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
