public class OOP7 {
    public static void main(String[]args){
        //This program is connected with Person.java,Student2.java,Employee.java


        // Super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and overriding
        //         Calls the parent constructor to initialize attributes.

        


        Person p1 = new Person("Emon", "Hossain");
        Student2 stu = new Student2("Rupom", "Khan", 3.25);
        Employee em = new Employee("Shible", "Khan", 50);

        p1.showName();
        stu.showName();
        System.out.println(stu.gpa);
        stu.showGPA();
        em.showSalary();
        
    }
}
