package org.example.challenge77.geometry.utils;

import org.example.challenge77.geometry.Circle;
import org.example.challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir  = new Circle(5.5);
        Rectangle rect  = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.length * rect.breadth;
        System.out.printf("Area of the circle is: %f, Area of rectangle is: %f", cirArea, rectArea);
    }
}
