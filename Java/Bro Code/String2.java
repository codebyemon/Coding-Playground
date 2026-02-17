public class String2 {
    public static void main(String[]args){
        String name1 = "Emon Hossain";
        String name2 = "Emon";
        String name3 = "emon hossain";
        

        if(name1.equals(("Emon Hossain"))){
            System.out.println("Your name can't be Emon Hossain");
        }
        else{
            System.out.println("Hello "+name1);
        }

        if(name2.equals(("Emon Hossain"))){
            System.out.println("Your name can't be Emon Hossain");
        }
        else{
            System.out.println("Hello "+name2);
        }

        if(name3.equalsIgnoreCase(("Emon Hossain"))){
            System.out.println("Your name can't be Emon Hossain");
        }
        else{
            System.out.println("Hello "+name3);
        }
       

    }
}
