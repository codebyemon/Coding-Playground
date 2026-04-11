public class Exception1 {
    public static void main(String[]args){
        /*  Exception = An event that interrupts the normal flow of a program
                        (Dividing by zero, file not found, mismatch input type)
                        surround any dangerous code with a try{} block
                        try{}, catch{}, finally{}
        */

        try{
            System.err.println(1/0);
        }
        catch(ArithmeticException e){
            System.out.println("You can not divide by zero.");
        }
    }
}
