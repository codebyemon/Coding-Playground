import java.util.Scanner;

public class Maths3 {
    public static void main(String[] args){
        //circumference = 2 * Math.PI * radius
        //area = Math.PI * Math.pow(radius,2)
        //volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is: "+circumference+" cm");
        System.out.println("The area is: "+area+" cm²");
        System.out.println("The volume is: "+volume+" cm³");

        System.out.printf("The circumference is: %.2fcm\n",circumference);
        System.out.printf("The area is: %.2fcm²\n",area);
        System.out.printf("The volume is: %.2fcm³\n",volume);



        sc.close();
    }
}
