/**
 * The Demo class tests the functionality of Point and MovablePoint classes.
 */
public class Demo {
    public static void main(String[] args) {
        Point point = new Point(2.5f, 3.5f);
        System.out.println(point); // Output: (2.5, 3.5)

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(movablePoint); // Output: (1.0, 2.0), speed=(0.5, 0.5)
        
        movablePoint.move();
        System.out.println(movablePoint); // Output: (1.5, 2.5), speed=(0.5, 0.5)
        
        movablePoint.move();
        System.out.println(movablePoint); // Output: (2.0, 3.0), speed=(0.5, 0.5)
    }
}
