public class OOP17 {
    String nm;
    public static void main(String[]args){
        Student s1 = new Student("Emon",111);
        Student s2 = new Student("Shible",112);
        s1.showDetail();
        s2.showDetail();
        Student.upUni("East Wast University");
        s1.showDetail();
        s2.showDetail();
    }
}

class Student{
    String name;
    int id;
    static String uniName = "EWU";

    Student(String n, int i){
        name = n;
        id = i;
    }

    static void upUni(String uniname){//static method
        uniName = uniname;
    }

    void showDetail(){//instance method
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University name: "+uniName);
    }

}