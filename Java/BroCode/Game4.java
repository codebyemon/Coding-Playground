import java.util.Scanner;
import java.util.Random;
public class Game4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the range- ");
        System.out.print("Max: ");
        int max = sc.nextInt();
        System.out.print("Min: ");
        int min = sc.nextInt();
        int rns = random.nextInt(min,max+1);
        System.out.println("System has taken it's number.");
        System.out.print("Now take your number: ");
        int rnu = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Press Enter to start...");
        sc.nextLine(); 
        int sg=0;
        int p=0;
        int[] his = new int[max];
        while(true){
            System.out.print("Guess my number ");
            int ug = sc.nextInt();
            if(ug==rns){
                System.out.println("You won.");
                break;
            }
            else if(ug>rns){
                System.out.println("Lower.");
            }
            else if(ug<rns){
                System.err.println("Higher.");
            }
            boolean j = true;
            while (j) {
                sg = random.nextInt(min, max + 1);
                j = false;  
                for (int i = 0; i < p; i++) {
                    if (sg == his[i]) {
                        j = true;  
                        break;
                    }
                }
            }
            his[p++] = sg; 
            System.out.println("I choose " + sg);
            System.out.println("1. You won.\n2. Higher.\n3. Lower.");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("I won!");
                break;
            }
            else if(choice == 2){
                min = sg;
            }
            else{
                max = sg;
            }
        }
        System.err.println("System's number was: "+rns);
        System.err.println("Your number was: "+rnu);
        sc.close();
    }
    
}

