import java.util.Random;
public class Randonum {
    public static void main(String[] args){
        Random ran = new Random();

        int number1;
        double number2;
        boolean isHeads;
        number1 = ran.nextInt(1,101);
        number2 = ran.nextDouble(1,101);
        isHeads= ran.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
