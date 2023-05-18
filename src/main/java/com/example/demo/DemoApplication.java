package com.example.demo;

import com.example.demo.shape.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Circle circle = new Circle(150);
        System.out.println("Information about circle radio = 150");
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle type: " + circle.getType());
        System.out.println("Circle point: " + circle.getPoint());
        Point point = new Point(2, 3);
        System.out.println("Information about Point x = 2, y = 3");
        System.out.println("To string: " + point.toString());
        Rectangle rectangle = new Rectangle(new Point(3, 4), new Point(4,5));
        System.out.println("Information about Rectangle first point x = 3 || y = 4, second point x = 4 || y = 5");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Bottom right: " + rectangle.getBottomRight());
        System.out.println("Top left: " + rectangle.getTopLeft());
        System.out.println("Type : " + rectangle.getType());
        System.out.println("Information about Square first point x = 9 || y = 6, second point x = 34 || y = 45");
        Square square = new Square(new Point(9, 6), new Point(34, 45));
        System.out.println("To string: " + square.toString());
        System.out.println("Information about Triangle first point x = 3 || y = 43, second point x = 3 || y = 53, third point x = 23 || y = 43");
        Triangle triangle = new Triangle(new Point(3, 43), new Point(3, 53), new Point(23, 43));
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Type : " + triangle.getType());
        System.out.println(triangle.getPoint3());
        System.out.println(triangle.getPoint2());
        System.out.println(triangle.getPoint1());
    }

}
