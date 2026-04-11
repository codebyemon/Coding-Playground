import java.util.*;

public class OOP2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();
        Student s2;
        s2 = new Student();
        // System.out.println(s1+" "+s2);

        //s1.name = "Emon";
        //s1.id = "111";
        //s1.cgpa = 3.89f;


        s1.name = sc.nextLine();
        s1.id = sc.nextLine();
        s1.cgpa = sc.nextFloat();
        sc.nextLine(); // Consume the newline after nextFloat()
        s2.name = sc.nextLine();
        s2.id = sc.nextLine();
        s2.cgpa = sc.nextFloat();
        sc.nextLine(); // Consume the newline after nextFloat()

        s1.showDetail();
        s2.showDetail();
        

        // s1=s2;
        // System.out.println(s1+" "+s2);

        s1.showDetail();
        s2.showDetail();
        
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

