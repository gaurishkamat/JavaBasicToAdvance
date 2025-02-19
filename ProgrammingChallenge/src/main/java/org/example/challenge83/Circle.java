package org.example.challenge83;

public class Circle extends Shape{
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
