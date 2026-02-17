public class OOP5 {
    public static void main(String[]args){
        // This program is connected with Friend.java
        
        // Static = Makes a variable or method belong to the class
        //          rather then to any specific objectl
        //          Commonly used for utility methods or shared resources.

        Friend f1 = new Friend("Emon");
        Friend f2 = new Friend("Remon");
        Friend f3 = new Friend("Shible");

        System.out.println(f1.name);
        System.out.println(f2.name);
        System.out.println(f3.name);

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
        

       

    }
}
