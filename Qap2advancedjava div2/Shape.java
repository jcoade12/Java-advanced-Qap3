public class Shape {
    protected String color;
    protected boolean filled;

    // No-arg constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor with parameters
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter for filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString method
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
