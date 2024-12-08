import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}
class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    double volume() {
        return length * width * height;
    }
}
class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}
class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends ThreeDObject {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}
public class q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for Box (length, width, height):");
        Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box - Surface Area: " + box.wholeSurfaceArea() + ", Volume: " + box.volume());

        System.out.println("Enter dimension for Cube (side):");
        Cube cube = new Cube(sc.nextDouble());
        System.out.println("Cube - Surface Area: " + cube.wholeSurfaceArea() + ", Volume: " + cube.volume());

        System.out.println("Enter dimensions for Cylinder (radius, height):");
        Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder - Surface Area: " + cylinder.wholeSurfaceArea() + ", Volume: " + cylinder.volume());

        System.out.println("Enter dimensions for Cone (radius, height):");
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone - Surface Area: " + cone.wholeSurfaceArea() + ", Volume: " + cone.volume());
    }
}
