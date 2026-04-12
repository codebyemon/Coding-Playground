import java.util.*;
public class Practice2{
    public static void main(String[]args){
        ArrayList<Student> st = new ArrayList<Student> ();
        st.add(new Student("emon",23));
        st.add(new Student("remon",20));
        st.add(new Student("shible",21));

        for(Student s : st){
            s.displayInfo();
        }


    }
}
class Student {
    String name;
    int age;

    // Constructor to initialize the object
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}