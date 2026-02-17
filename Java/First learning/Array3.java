import java.util.*;
public class Array3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0;i<num.length;i++){//num.length also indicate size;
            if(x==num[i]){
                System.out.println("x found at index: "+i);
                return;
            }
        }
    }
}