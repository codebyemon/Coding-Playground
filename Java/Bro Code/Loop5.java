import java.util.Scanner;
public class Loop5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows=0;
        int columns=0;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = sc.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = sc.next().charAt(0);

        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
