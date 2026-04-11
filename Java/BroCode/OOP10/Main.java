public class Main {
    public static void main(String[]args){
        /*  abstract = Used to define abstract classes and methods.
                       Abstraction is the process of gidding implementation details
                       and showing only the essential features.
                       Abstract classes can not be instantiated directly
                       Can contain 'abstract' methods (which must be implemented in the children class)
                       Can contain 'concrete' methods (which are inherited)*/
        
        Circle c1 = new Circle(3);
        Triangle t1 = new Triangle(4,5);
        Rectangle r1 = new Rectangle(6,7);

        c1.display();
        System.out.println(c1.area());
        t1.display();
        System.out.println(t1.area());
        r1.display();
        System.out.println(r1.area());
       
                       



    }
}
