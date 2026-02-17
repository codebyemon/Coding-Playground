public class OOP2 {
    public static void main(String[]args){
        //This program is connected with Student.java
        
        //constructor = A special method to initialize objects
        //              You can pass arguments to a constructor
        //              and set up initial values

        Student stu1 = new Student("Emon",20,3.95);
        Student stu2 = new Student("Rupom",19,3.75);

        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.gpa);
        System.out.println(stu1.isEnrolled);
        stu1.study();

        System.out.println(stu2.name);
        System.out.println(stu2.age);
        System.out.println(stu2.gpa);
        System.out.println(stu2.isEnrolled);
        stu2.study();
    }
}
