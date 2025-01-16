package org.example.challenge86;

public class Car extends Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("Car is in service");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.service();
    }
}
