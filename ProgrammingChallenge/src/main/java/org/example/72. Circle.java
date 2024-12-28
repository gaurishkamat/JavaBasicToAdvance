package org.example;

import java.util.Scanner;

class Circle {
    double radiusInMm;

    Circle(double radius){
        this.radiusInMm = radius;
    }

    double getCircumference(){
        return 2 * Math.PI * radiusInMm;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusInMm, 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = input.nextInt();
        Circle circle = new Circle(r);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Circumference of circle: " + circle.getCircumference());
    }
}
