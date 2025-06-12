abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double calculateVolume() {
        return side * side * side;
    }

    double calculateArea() {
        return 6 * side * side;
    }

    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    double length, width, height;

    Cuboid(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    double calculateVolume() {
        return length * width * height;
    }

    double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    double radius, height;

    Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    double calculateVolume() {
        return 3.14 * radius * radius * height;
    }

    double calculateArea() {
        return 2 * 3.14 * radius * (radius + height);
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;  // Just base circumference
    }
}

public class Q5 {
    public static void main(String[] args) {
        Draw cube = new Cube(3);
        Draw cuboid = new Cuboid(2, 3, 4);
        Draw cylinder = new Cylinder(3, 5);

        System.out.println("Cube => Volume: " + cube.calculateVolume() +
                           ", Area: " + cube.calculateArea() +
                           ", Perimeter: " + cube.calculatePerimeter());

        System.out.println("Cuboid => Volume: " + cuboid.calculateVolume() +
                           ", Area: " + cuboid.calculateArea() +
                           ", Perimeter: " + cuboid.calculatePerimeter());

        System.out.println("Cylinder => Volume: " + cylinder.calculateVolume() +
                           ", Area: " + cylinder.calculateArea() +
                           ", Perimeter: " + cylinder.calculatePerimeter());
    }
}
