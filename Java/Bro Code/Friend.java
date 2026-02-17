public class Friend {
    //This class is for OOP5.java

    // Static = Makes a variable or method belong to the class
    //          rather then to any specific objectl
    //          Commonly used for utility methods or shared resources.


    String name;
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have "+numOfFriends+" total friends.");
    }
    
}
