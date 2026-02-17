public class String1 {
    public static void main(String[]args){
        String name = "Emon Hossain";

        int length = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf("H");
        int index2 = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("o","a");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(index2);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello "+name);
        }
        System.out.println(name.contains(" "));
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name does not contains a space");
        }
        
        
       

    }
}

