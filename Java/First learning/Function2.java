import java.util.*;

class CalSum{
    int x;
    int y;
    CalSum(int a,int b){
        x=a;
        y=b;
    }
    int printSum(){
        return x+y;
    }
}

public class Function2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        CalSum var1 = new CalSum(a,b);
        System.out.println("The sum of two numbers is "+var1.printSum());


    }
}