public class Person {
    //This class is for OOP7.java
    //This class is the parent class of Student2,Employee class.


    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first+" "+this.last);
    }


}
