public class OOP15 {
    public static void main(String[]args){
        Student s1 = new Student("Emon",111);
        Student s2 = new Student("Shible",112);
        Student s3 = new Student("Rupom",113);
        System.out.println("There are "+Student.count+ " students:");
        s1.showDetail();
        s2.showDetail();
        s3.showDetail();


    }
}

class Student{
    String name;
    int id;
    static int count = 0;

    Student(String nm, int i){
        name = nm;
        id = i;
        count++;
    }

    void showDetail(){
        System.out.println(name + " " + id);
    }
}