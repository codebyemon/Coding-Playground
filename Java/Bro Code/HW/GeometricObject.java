import java.util.Date;
public class GeometricObject {

    // Fields
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    // No-arg constructor
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new java.util.Date();
    }

    // Constructor with color and filled parameters
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for filled
    public boolean isFilled() {
        return filled;
    }

    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter for dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // toString method
    @Override
    public String toString() {
        return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
    }
}