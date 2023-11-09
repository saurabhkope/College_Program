// Q2. Define a “Point” class having members – x,y (coordinates). Define default constructor and
// parameterized constructors. Define subclass “ColorPoint” with member as color. Write display
// method to display the details of Point. 

class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display method
    public void display() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        // Default constructor
        super(); // Calls the default constructor of the superclass (Point)
        this.color = "No Color";
    }

    public ColorPoint(int x, int y, String color) {
        // Parameterized constructor
        super(x, y); // Calls the parameterized constructor of the superclass (Point)
        this.color = color;
    }

    @Override
    public void display() {
        super.display(); // Call the display method of the superclass (Point)
        System.out.println("Color: " + color);
    }
}

public class PointDemo2 {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        System.out.println("Point 1:");
        point1.display();

        ColorPoint colorPoint1 = new ColorPoint(2, 4, "Red");
        System.out.println("Color Point 1:");
        colorPoint1.display();
    }
}
