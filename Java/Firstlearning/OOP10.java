public class OOP10 {
    public static void main(String[] args){
        Person p1 = new Person("Emon",111);
        Person p2 = new Person("Shible",112);
        p1.makeCall(p2);//call by referance
        p1.printit(8);//call by value
        
    }

    
}

class Person{
    String name;
    int id;
    Person(String n, int id){
        this.name = n;
        this.id = id;
    }

    void makeCall(Person per){
        System.out.println("I am "+name+". Hay, "+per.name+" sir is calling you.");
    }

    void printit(int a){
        System.out.println(a);
    }
}