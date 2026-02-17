import java.util.*;

public class Function3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Factorial f = new Factorial(a);
        f.findFact();

    }
}

class Factorial{
    int x;
    int mul=1;
    Factorial(int a){
        x = a;
    }

    void findFact(){
        if(x==0){
            System.out.println(mul);
        }
        else if(x<0){
            System.out.println("Not valid number.");
        }
        else{
            for(int i=1;i<=x;i++){
                mul=mul*i;
            }
            System.out.println(mul);
        }
    }
}
