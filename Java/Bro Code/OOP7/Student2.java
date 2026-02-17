public class Student2 extends Person{
    //This class is for OOP7.java
    //This class is a child class of Person class

    double gpa;

    Student2(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first +"'s gpa is: "+this.gpa);
    }
}
