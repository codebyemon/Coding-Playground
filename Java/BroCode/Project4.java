import java.util.Random;
import java.util.Scanner;

public class Project4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "Yes";

        do{
            System.out.print("Enter your move (rock,paper,scissors): ");
        playerChoice = sc.nextLine().toLowerCase();

        if(!playerChoice.equals("rock")&&!playerChoice.equals("paper")&&!playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
        }

        computerChoice = choices[rn.nextInt(3)];
        System.out.println("Computer choice: "+computerChoice);
        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a tie.");
        }
        else if(playerChoice.equals("rock")&&computerChoice.equals("scissors")){
            System.err.println("You win.");
        }
         else if(playerChoice.equals("paper")&&computerChoice.equals("rock")){
            System.err.println("You win.");
        }
         else if(playerChoice.equals("scissors")&&computerChoice.equals("paper")){
            System.err.println("You win.");
        }
        else{
            System.out.println("You lose.");
        }
        System.out.print("Play again (yes/no): ");
        playAgain = sc.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing.");

        sc.close();
    }
}
