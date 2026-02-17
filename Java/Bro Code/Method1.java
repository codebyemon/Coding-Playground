public class Method1 {
    public static void main(String[]args){
        //Method = a block of reusable code that is executed when called()
        String name = "Emon Hossain";
        int age = 20;
        happyBirthday(name,age);
        System.out.println(square(3));
        System.out.println(cube(3));
        System.out.println(getFullname("Emon","Hossain"));
        if(ageCheck(age)){
            System.out.println("You may sign up");
        }
        else{
            System.out.println("You must be 18+ to sign up");
        }


    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s\n",name);
        System.out.printf("You are %d years old now.\n",age);
    }
    static double square(double num){
        return num * num;
    }
    static double cube(double number){
        return number*number*number;
    }
    static String getFullname(String first, String last){
        return first+" "+last;
    }
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
