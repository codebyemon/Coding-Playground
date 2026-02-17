import java.util.Scanner;
import java.util.Random;

public class Game2{
    public static void main(String[]args){
        // Number guessing game

        Random random = new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.print("Set the max range of the number you want to guess: ");

        int guess;
        int guess2;
        boolean brk;
        int attempts = 0;
        int attempts2 = 0;
        int min = 1;
        int max = sc.nextInt();
        int[] ar = new int[max];
        sc.nextLine();
        int randomNumber = random.nextInt(min,max+1);

        
        System.out.printf("Guess a number between %d-%d\n",min,max);
        System.out.print("Press Enter to start...");
        sc.nextLine(); 

        do{
            System.out.print("Enter a guess: ");
            guess2 = sc.nextInt();
            attempts2++;

            if(guess2<randomNumber){
                System.out.println("Too low! Try again");
            }
            else if(guess2>randomNumber){
                System.out.println("Too high! Try again");
            }
        }while(guess2 != randomNumber);

        do{
            guess = random.nextInt(min,max+1);
            brk = false;
            for(int i=0;i<attempts;i++){
                if(guess == ar[i]){
                    brk = true;
                    break;
                }
            }
            if(brk){
                continue;
            }
            ar[attempts]=guess;
            System.out.println(guess);
            attempts++;

            if(guess<randomNumber){
                min = guess;
            }
            else if(guess>randomNumber){
                max = guess;
            }
        }while(guess != randomNumber);
        System.out.println("The number was "+randomNumber);
        System.out.println("You took "+attempts2+" attempts of guess the right number.");
        System.out.println("Computer took "+attempts+" attempts of guess the right number.");

        sc.close();
    }
}
