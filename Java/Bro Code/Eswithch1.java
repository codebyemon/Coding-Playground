import java.util.Scanner;
public class Eswithch1 {
    public static void main(String[]args){
        // Enhanced switch = A replacement to many else if statements which is a feature of java14

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();

        switch(day){
            // case "Monday" -> System.out.println("It is a weekday 😔");
            // case "Tuesday" -> System.out.println("It is a weekday 😔");
            // case "Wednesday" -> System.out.println("It is a weekday 😔");
            // case "Thursday" -> System.out.println("It is a weekday 😔");
            // case "Friday" -> System.out.println("It is a weekday 😔");
            // case "Saturday" -> System.out.println("It is the weekend 🤗");
            // case "Sunday" -> System.out.println("It is the weekend 🤗");
            // default -> System.out.println(day +" is not a day");

            case "Monday","Tuesday" ,"Wednesday","Thursday", "Friday" -> System.out.println("It is a weekday 😔");
            case "Saturday","Sunday" -> System.out.println("It is the weekend 🤗");
            default -> System.out.println(day +" is not a day");
        }

        sc.close();
    }
}
