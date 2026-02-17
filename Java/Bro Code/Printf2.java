public class Printf2 {
     public static void main(String[] args){
        //printf()=is a method used to format output
        //%[flags][width][.precision][specifier-character]

        //[.precision]

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.2f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.2f\n",price3);
    }
}
