public class Circle extends GeometricObject {

    // Field
    private double radius;

    // No-arg constructor
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Returns the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Returns the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Returns the diameter of the circle
    public double getDiameter() {
        return 2 * radius;
    }

    // Prints circle information
    public void printCircle() {
        System.out.println("Circle [radius=" + radius
                + ", color=" + getColor()
                + ", filled=" + isFilled()
                + ", dateCreated=" + getDateCreated() + "]");
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + getColor()
                + ", filled=" + isFilled() + "]";
    }
}