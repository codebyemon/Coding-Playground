import java.util.*;
public class Exception2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.err.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("That was not a number.");
        }
        catch(Exception e){
            System.err.println("Something went wrong.");
        }
        finally{
            sc.close();
        }

    }
}
