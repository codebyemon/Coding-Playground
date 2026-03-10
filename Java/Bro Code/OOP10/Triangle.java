public class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height){
        this.base=base;
        this.height = height;
    }

    void display(){  // Concrete method
        System.out.println("This is a Triangle");
    }

    @Override
    double area(){
        return base * height* 0.5;
    }
    
}
