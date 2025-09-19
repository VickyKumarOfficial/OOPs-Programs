import java.lang.Math;
// Abstract methods can be created by it's child classes but can't make another abstract main class 
abstract class Shape { // this is an abstract class. This contains abstract classes or concrete methods. 
    abstract double area(); // This is an abstract method
    void display() {
        System.out.println("This is a shape!");
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double half = 0.5, b, h;
    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    double area() {
        return half * b * b;
    }
}

class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    double area() {
        return side * side;
    }
}

public class AbstractionKeyword {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(5, 2);
        Square square = new Square(5);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(square.area());
    }
}
