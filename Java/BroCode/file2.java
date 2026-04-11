import java.io.*;
public class file2 {
    public static void main(String[]args){
        // How to read a file using Java (3 popular options)
        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g. images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String fileName = "test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.err.println("Could not locate file.");
        }
        catch(IOException e){
            System.err.println("Something went wrong.");
        }
    }
}
