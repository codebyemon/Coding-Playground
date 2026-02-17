public class Rectangle extends GeometricObject {

    // Fields
    private double width;
    private double height;

    // No-arg constructor
    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with width and height
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    // Constructor with width, height, color, and filled
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Returns the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Returns the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height
                + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}