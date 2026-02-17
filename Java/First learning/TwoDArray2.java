import java.util.*;
public class TwoDArray2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] num = new int[row][column];

        for(int r=0;r<row;r++){
            for(int c=0;c<column;c++){
                num[r][c] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int r=0;r<row;r++){
            for(int c=0;c<column;c++){
                if(num[r][c]==x){
                    System.out.println("x found at location (" + r + "," + c + ")");
                    break;
                }
            }
        }
    }
}