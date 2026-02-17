import java.util.*;

public class OOP {
    public static void main(String[] args){
        //s1.name = "Emon";
        //s1.id = "111";
        //s1.cgpa = 3.89;

        Student s1 = new Student();
        Student s2;
        s2 = new Student();

        s1.input();
        s2.input();
        s1.showDetail();
        s2.showDetail();

        // s1.name = sc.nextLine();
        // s1.id = sc.nextLine();
        // s1.cgpa = sc.nextFloat();
        // sc.nextLine(); // Consume the newline after nextFloat()
        // s2.name = sc.nextLine();
        // s2.id = sc.nextLine();
        // s2.cgpa = sc.nextFloat();
        // sc.nextLine(); // Consume the newline after nextFloat()

        
    }
}


class Student{
    Scanner sc = new Scanner(System.in);
    String id;//instance variable
    String name;
    float cgpa;

    void input(){
        name = sc.nextLine();
        id = sc.nextLine();
        cgpa = sc.nextFloat();
    }

    void showDetail(){//instance method
        System.out.println(name + " " + id + " " + cgpa);
    }
}