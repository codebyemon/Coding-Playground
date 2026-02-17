import java.util.Scanner;
public class Array3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size;
        String[] foods;
        System.out.print("What number of food do you want?: ");
        size = sc.nextInt();
        sc.nextLine();
        foods = new String[size];
        // foods[0]="pizza";
        // foods[1]="taco";
        // foods[2]="hamburger";
        for(int i=0;i<foods.length;i++){
            System.out.print("Enter a food: ");
            foods[i] = sc.nextLine();
        }

        for(int i=0;i<foods.length;i++){
            System.out.println(foods[i]);
        }




        sc.close();
    }
}
