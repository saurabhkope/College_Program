// Q2. Define an interface “Operation” which has methods area(),volume(). Define a constant PI
// having value 3.142. Create a class circle (member – radius) which implements this interface.
// Calculate and display the area and volume.

// Define the "Operation" interface
interface Operation {
    double PI = 3.142; // Constant for PI

    double area();
    double volume();
}

// Create a class "Circle" that implements the "Operation" interface
class Circle implements Operation {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the area() method for a circle
  
    public double area() {
        return PI * radius * radius;
    }

    // Implement the volume() method (volume of a circle is 0)
   
    public double volume() {
        return 0;
    }
}

public class CircleExample2 {
    public static void main(String[] args) {
       
        Circle c = new Circle(5);

     
        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Volume: " + c.volume());
    }
}
