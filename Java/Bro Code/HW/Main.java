public class Main {
    public static void main(String[] args) {

        // ---- GeometricObject demo ----
        System.out.println("=== GeometricObject ===");
        GeometricObject geo = new GeometricObject("blue", true);
        System.out.println(geo);

        // ---- Circle demo ----
        System.out.println("\n=== Circle ===");
        Circle c1 = new Circle();
        System.out.println("Default circle: " + c1);

        Circle c2 = new Circle(5.0);
        System.out.println("Circle with radius 5: " + c2);

        Circle c3 = new Circle(7.5, "red", true);
        System.out.printf("Area:      %.2f%n", c3.getArea());
        System.out.printf("Perimeter: %.2f%n", c3.getPerimeter());
        System.out.printf("Diameter:  %.2f%n", c3.getDiameter());
        c3.printCircle();

        // ---- Rectangle demo ----
        System.out.println("\n=== Rectangle ===");
        Rectangle r1 = new Rectangle();
        System.out.println("Default rectangle: " + r1);

        Rectangle r2 = new Rectangle(4.0, 6.0);
        System.out.printf("Area:      %.2f%n", r2.getArea());
        System.out.printf("Perimeter: %.2f%n", r2.getPerimeter());

        Rectangle r3 = new Rectangle(3.0, 8.0, "green", false);
        System.out.println(r3);

        // ---- Polymorphism demo ----
        System.out.println("\n=== Polymorphism ===");
        GeometricObject[] shapes = {
            new Circle(4.0, "yellow", true),
            new Rectangle(3.0, 5.0, "purple", false)
        };

        for (GeometricObject shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.printf("  -> Area: %.2f, Perimeter: %.2f%n",
                        ((Circle) shape).getArea(), ((Circle) shape).getPerimeter());
            } else if (shape instanceof Rectangle) {
                System.out.printf("  -> Area: %.2f, Perimeter: %.2f%n",
                        ((Rectangle) shape).getArea(), ((Rectangle) shape).getPerimeter());
            }
        }
    }
}