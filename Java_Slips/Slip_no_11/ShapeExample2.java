// Q2. Create an abstract class Shape with methods area & volume. Derive a class Sphere (radius).
// Calculate and display area and volume. 

abstract class Shape {
    public abstract double area();

    public abstract double volume();
    final double pi=3.14;
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

  
    public double area() {
        return 4 * pi * radius * radius; // Surface area of a sphere
    }

   
    public double volume() {
        return (4.0 / 3.0) * pi *radius*radius*radius; // Volume of a sphere
    }
}

public class ShapeExample2 {
    public static void main(String[] args) {
    
        Sphere s = new Sphere(5);

        System.out.println("Sphere Surface Area: " + s.area());
        System.out.println("Sphere Volume: " + s.volume());
    }
}
