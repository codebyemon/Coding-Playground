public class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    void display(){  // Concrete method
        System.out.println("This is a Rectangle");
    }

    @Override
    double area(){
        return length * width;
    }
    
}
