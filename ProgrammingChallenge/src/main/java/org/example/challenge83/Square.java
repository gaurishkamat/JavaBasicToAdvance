package org.example.challenge83;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return Math.pow(side, 2);
    }
}
