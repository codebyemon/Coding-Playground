import java.util.*;
public class Function{
    // public static void printMyname(String name){
    //     System.out.println(name);
    //     return;
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Printname p1 = new Printname(name);
        p1.printName();
    }
}

class Printname{
    String nam;
    Printname(String name){
        nam = name;
    }
    void printName(){
        System.out.println(nam);
    }
}