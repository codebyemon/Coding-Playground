//Encapsulation
public class OOP12 {
    public static void main(String[]args){
        Student s1 = new Student("Bob",11);
        Student s2 = new Student("Shible",12);
        s1.showDetail();
        s1.setter(22);
        System.out.println(s1.getter());

    }
}

//When data are private.
class Student{
    String name;
    private int id;

    Student(String nm, int i){
        name = nm;
        id = i;
    }

    void setter(int i){
        if(i>0){
            id = i;
        } 
        else{
            System.out.println("Invalid id given!");
        }
    }//This is why we use private key word to protect inportant data in our code.

    int getter(){
        return id;
    }

    void showDetail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}