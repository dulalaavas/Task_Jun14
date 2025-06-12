abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
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

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculateArea() {
        double s = (a + b + c) / 2;
        double areaSquared = s * (s - a) * (s - b) * (s - c);
        double x = areaSquared;
        for (int i = 0; i < 10; i++) {
            x = 0.5 * (x + areaSquared / x);
        }
        return x;
    }

    double calculatePerimeter() {
        return a + b + c;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(4, 6);
        Shape tri = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rect.calculateArea() + ", Perimeter: " + rect.calculatePerimeter());
        System.out.println("Triangle Area: " + tri.calculateArea() + ", Perimeter: " + tri.calculatePerimeter());
    }
}
