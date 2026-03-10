public class Circle extends Shape{
    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }

    void display(){  // Concrete method
        System.out.println("This is a circle");
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
