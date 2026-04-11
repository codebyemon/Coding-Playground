public class Employee extends Person{
    //This class is for OOP7.java
    //This class is a child class of Person class

    int salary;

    Employee(String first, String last, int salary){
        super(first,last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first+"'s salary is $ "+this.salary);
    }
}
