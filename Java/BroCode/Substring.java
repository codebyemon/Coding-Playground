import java.util.Scanner;
public class Substring {
    public static void main(String[]args){
        // .substring = A method used to extract a portion of a string
        // .substring(start,end)

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");

        String email;
        String username;
        String domain;

        email = sc.nextLine();

        if(email.contains("@")){
            // String username = email.substring(0,11);
            // String domain = email.substring(12,21);// or email.substring(12);

            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }

        

        



        sc.close();
    }
}
