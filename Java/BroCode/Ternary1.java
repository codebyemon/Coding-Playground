public class Ternary1 {
    public static void main(String[]args){
        // ternary operator ? = Return 1 of 2 values of a condition is true
        // variable = (condition) ? ifTrue : ifFalse

        int score = 76;
        int hours = 13;
        int income = 60000;

        // if(score >= 60){
        //     System.out.println("PASS");
        // }
        // else{
        //     System.out.println("FAIL");
        // }

        // Using ternary operator.

        String passOrfail = (score >= 60) ? "PASS" : "FAIL";
        String evenOrodd = (score % 2 == 0) ? "EVEN" : "ODD";
        String timeOfday = (hours < 12) ? "A.M" : "P.M";
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(passOrfail);
        System.out.println(evenOrodd);
        System.out.println(timeOfday);
        System.out.println(taxRate);

    }
}
