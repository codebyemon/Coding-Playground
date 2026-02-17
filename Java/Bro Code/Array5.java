import java.util.Scanner;
public class Array5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String[] fruits = {"apple","orange","banana"};
        System.out.print("Enter what are you searching for: ");
        String target = sc.nextLine();
        boolean isFound = false;
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: "+i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array.");
        }




        sc.close();
    }
}
