// Q2. Define an interface “Operation” which has methods area(),volume(). Define a constant PI
// having a value 3.142. Create a class cylinder (members – radius, height) which implements this
// interface. Calculate and display the area and volume.

// Define the "Operation" interface
interface Operation {
    double PI = 3.142; // Constant for PI

    double area();
    double volume();
}

// Create a class "Cylinder" that implements the "Operation" interface
class Cylinder implements Operation {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Implement the area() method for a cylinder
  
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    // Implement the volume() method for a cylinder
   
    public double volume() {
        return PI * radius * radius * height;
    }
}

public class CylinderExample2 {
    public static void main(String[] args) {

        Cylinder c = new Cylinder(5, 10);

        System.out.println("Cylinder Surface Area: " + c.area());
        System.out.println("Cylinder Volume: " + c.volume());
    }
}

