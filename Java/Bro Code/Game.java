import java.util.Scanner;
import java.util.Random;

public class Game{
    public static void main(String[]args){
        // Number guessing game

        Random random = new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.print("Set the max range of the number you want to guess: ");

        int guess;
        int attempts = 0;
        int min = 1;
        int max = sc.nextInt();
        int randomNumber = random.nextInt(min,max+1);

        
        System.out.printf("Guess a number between %d-%d\n",min,max);

        do{
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("Too low! Try again");
            }
            else if(guess>randomNumber){
                System.out.println("Too hight! Try again");
            }
            else{
                System.out.println("Correct! The number was "+randomNumber);
            }
        }while(guess != randomNumber);

        System.out.println("You have won");
        System.err.println("It took "+attempts+" attempts of guess the right number.");





        sc.close();
    }
}
