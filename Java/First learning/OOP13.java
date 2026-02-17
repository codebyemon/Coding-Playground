public class OOP13 {
    public static void main(String[]args){
        Student s1 = new Student("Bob",11);
        Student s2 = new Student("Shible",12);
        s1.showDetail();
        

    }
}

//When methods are private.
class Student{
    String name;
    private int id;

    Student(String nm, int i){
        name = nm;
        id = i;
    }

    private void calCgpa(){
        System.out.println("CGPA calculated.");
    }

    

    void showDetail(){
        calCgpa();
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}