public class User {
    //This class is for OOP3.java
    // Overloaded constructors = Allow a class to have multiple constructors
    //                           with different parameter lists.
    //                           Enable objects to be initialized is various ways.
    String username;
    String email;
    int age;

    User(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
