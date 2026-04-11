public class OOP9 {
    public static void main(String[]args){
        Student s1 = new Student("Bob",11);
        Student s2 = new Student("Carol",22);
        Student s3 = new Student();
        Student s4 = new Student("David",56,3.89);
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo2();
    }
}


class Student{
    String name;
    int id;
    double cgpa;

    Student(){//Is called Constructor
    }

    Student(String name, int id, double cgpa){//Is called Constructor
        System.out.println("Emon");
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    Student(String name, int id){//Is called Constructor
        System.out.println("Emon");
        this.name = name;
        this.id = id;
    }

    //When a class has multipal constructors with same and different number of paramiters or data types of paramiter is called Constructor Overloading.


    void showInfo(){
        System.out.println(name+" "+id);
    }

    void showInfo2(){
        System.out.println(name+" "+id+" "+cgpa);
    }
}