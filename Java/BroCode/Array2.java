import java.util.Arrays;
public class Array2 {
    public static void main(String[]args){
        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};
        fruits[1]="Pineapple";
        System.out.println(fruits.length);

        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }

        Arrays.sort(fruits);
        Arrays.fill(fruits,"Orange");
        
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
