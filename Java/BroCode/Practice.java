import java.io.*;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String testInput=sc.nextLine();
      try{
        IntegerParser.parseInteger(testInput);
      }catch(CustomNumberFormatException e){
        System.out.println("Something went wrong: "+e.getMessage());
      }
           
    }
}

class CustomNumberFormatException extends Exception{
    public CustomNumberFormatException(String message){
        super(message);
    }
}

class IntegerParser{
    public static void parseInteger(String input) throws CustomNumberFormatException{
        try{
            int result = Integer.parseInt(input);
            System.out.println("Successfully parsed: "+result);
        }
        catch(Exception e){
            throw new CustomNumberFormatException("The input is not valid");
        }

    }
}