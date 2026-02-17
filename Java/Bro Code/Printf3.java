public class Printf3 {
    public static void main(String[] args){
        //printf()=is a method used to format output
        //%[flags][width][.precision][specifier-character]

        //[flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 900.99;
        double price2 = 100000.15;
        double price3 = -54000.01;
        //+
        System.out.printf("%+.2f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.2f\n",price3);
        //,
        System.out.printf("%,.2f\n",price1);
        System.out.printf("%,.2f\n",price2);
        System.out.printf("%,.2f\n",price3);
        //(
        System.out.printf("%(.2f\n",price1);
        System.out.printf("%(.2f\n",price2);
        System.out.printf("%(.2f\n",price3);
        //space
        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("% .2f\n",price3);
    }
}
