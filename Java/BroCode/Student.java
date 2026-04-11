public class Student {
    // This class is for OOP2.
    //constructor = A special method to initialize objects
    //              You can pass arguments to a constructor
    //              and set up initial values
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;

    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
