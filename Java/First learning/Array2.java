import java.util.*;
public class Array2{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
    }
}