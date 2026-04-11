public class Array1 {
    public static void main(String[]args){
        // array = a collection of values of the same data type.
        // think of it as a variable that can store more than 1 value.

        // String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};
        // int[] num = {1,2,3,4};
        // double[] n = {1.5,2.75,3.5,4.5};
        // char[] c = {'a','b','c','d'};
        boolean[] b = {true,false,true,false};
        b[1]= true;
        for(int i=0;i<4;i++){
            // System.out.println(fruits[i]);
            // System.out.println(num[i]);
            // System.out.println(n[i]);
            // System.out.println(c[i]);
            System.out.println(b[i]);


        }
    }
}
