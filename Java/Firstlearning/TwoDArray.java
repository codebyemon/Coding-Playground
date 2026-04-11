import java.util.*;
public class TwoDArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] num = new int[row][column];

        for(int r=0;r<row;r++){
            for(int c=0;c<column;c++){
                num [r][c] = sc.nextInt();
            }
        }

        for(int r=0;r<row;r++){
            for(int c=0;c<column;c++){
                System.out.print(num[r][c] + " ");
            }
            System.out.println();
        }
    }
}