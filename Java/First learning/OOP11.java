import java.util.Arrays;
public class OOP11 {
    public static void main(String[] args){
        Student s1 = new Student("Emon",111);
        Course c1 = new Course("CSE103","Structured Programing");
        Course c2 = new Course("CSE106","Discrit Mathmatics");
        Course c3 = new Course("MAT101","Differentiation and Integration");
        Course c4 = new Course("MAT102","Differentiation and Speatial Function");
        Course c5 = new Course("MAT104");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.addCourse(c3);
        s1.addCourse(c4);
        s1.addCourse(c5);
        s1.showDetail();
    }
}
class Course{
    String code;
    String title;

    Course(String c, String t){
        code = c;
        title = t;
    }

    Course(String c){
        code = c;
        title = "Not setted yet";
    }
}

class Student{
    String name;
    int id;
    Course [] courses = new Course[5];
    int coursCount = 0;

    Student(String nm, int i){
        name = nm;
        id = i;
    }

    void addCourse(Course c){
        courses[coursCount] = c;
        coursCount ++;
    }

    void showDetail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Course taken: ");
        for(int i=0; i<coursCount;i++){
            System.out.println(courses[i].code+"("+courses[i].title+")");
        }
    }
}