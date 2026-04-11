public class OOP3 {
    public static void main(String[]args){
        //This program is connected with User.java
        
        // Overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized is various ways.

        User user1 = new User("Rupom");
        User user2 = new User("Emon","emon@gmail.com");
        User user3 = new User("Shible","shible@gmail.com",20);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);



    }
}
