public class Square extends Rectangle {
    // Constructor with side
    public Square(double side) {
        super(side, side);
    }

    // Constructor with side, color, and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Override setWidth and setLength to maintain square geometry
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // toString method
    @Override
    public String toString() {
        return "A Square with side=" + width + ", which is a subclass of " + super.toString();
    }
}
