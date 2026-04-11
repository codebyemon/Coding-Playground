import java.util.*;
public class Strings6 {
    public static void main(String[] args){
        //reverse a string
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuilder sb = new StringBuilder(st);
        for(int i=0;i<sb.length()/2;i++){
            int front =i;
            int back = sb.length()-1-i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.println(sb);
    }
}
