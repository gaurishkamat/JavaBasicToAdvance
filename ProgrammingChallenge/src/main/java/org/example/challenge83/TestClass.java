package org.example.challenge83;

public class TestClass {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.printf("Area of circle is: %f", circle.calculateArea());

        Square square = new Square();
        square.setSide(5);
        System.out.printf("Area of square is: %f",square.calculateArea());
    }
}
