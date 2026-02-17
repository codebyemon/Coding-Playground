public class OOP3 {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Emon";
        s1.id = "2025260111";
        s2.name = "Shible";
        s2.id = "2025260112";
        s1.showDetail();
        s2.showDetail();

    }
}

class Student{
    String name;
    String id;

    void showDetail(){
        System.out.println(name + " " + id);
    }
}
