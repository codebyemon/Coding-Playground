import java.util.Scanner;

public class Scan2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //Common issue.
        //When you take input String after int or double. You will not be able to input the String.

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //You have to add this line to solve the problem.
        scanner.nextLine();

        System.out.print("What is your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are "+age+" years old");
        System.out.println("You like the color "+color);





        scanner.close();
    }
}
