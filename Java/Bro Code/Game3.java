import java.util.Random;
import java.util.Scanner;
public class Game3 {
    public static void main(String[]args){
        //Coin fliping game;
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        char exit;
        

        while(true){
            System.out.print("Press S to flip the coin or Q to quit the game... ");
            exit = sc.next().toUpperCase().charAt(0);
            if(exit=='Q'){
                break;
            }
            boolean isHeads = rn.nextBoolean();
            if(isHeads){
                System.out.println("HEADS");
            }
            else{
                System.out.println("TAILS");
            }
        }
        


        sc.close();
    }
}
