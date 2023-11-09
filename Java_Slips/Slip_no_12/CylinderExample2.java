// Q2. Create an abstract class Shape with methods area & volume. Derive a class Cylinder (radius,
// height). Calculate area and volume.

abstract class Shape {
    public abstract double area();

    public abstract double volume();
    final double pi=3.14;
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

   
    public double area() {
        // Calculate the surface area of the cylinder
        return 2 * pi * radius * (radius + height);
    }


    public double volume() {
        // Calculate the volume of the cylinder
        return pi * radius * radius * height;
    }
}

public class CylinderExample2 {
    public static void main(String[] args) {
            
        Cylinder cylinder = new Cylinder(5, 10);

        System.out.println("Cylinder Surface Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}
