public class Rectangle extends Shape {
    protected double width;
    protected double length;

    // No-arg constructor
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Constructor with width, length, color, and filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter and Setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter and Setter for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Method to calculate area
    public double getArea() {
        return width * length;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // toString method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
