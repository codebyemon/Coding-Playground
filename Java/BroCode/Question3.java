import java.util.*;
public class Question3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String testInput = sc.nextLine();
        try{
            System.out.println("Attempting to parse input...");
            IntegerParser.parseIntefer(testInput);
        }catch(CustomNumberFormatException e){
            System.out.println("Caught custom exception. "+e.getMessage());
        }

    }
}


class CustomNumberFormatException extends Exception{
    public CustomNumberFormatException(String message){
        super(message);
    }
}

class IntegerParser{
    public static void parseIntefer(String input) throws CustomNumberFormatException{
        try{
            int result = Integer.parseInt(input);
            System.out.println("Successfully parsed: "+result);
        }catch(NumberFormatException e){
            throw new CustomNumberFormatException("The input is not valid.");
        }
    }
}