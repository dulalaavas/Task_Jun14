import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        // Using basic Pi approximation
        return 3.14 * radius * radius;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        Shape rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Shape circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.calculateArea());

        sc.close();
    }
}
