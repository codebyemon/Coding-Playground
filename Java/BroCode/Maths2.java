import java.util.Scanner;

public class Maths2 {
    public static void main(String[] args){
        //Hypotenuse c = Math.sqrt(a² + b²)

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = sc.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is: "+c+"cm");


        sc.close();
    }
}
