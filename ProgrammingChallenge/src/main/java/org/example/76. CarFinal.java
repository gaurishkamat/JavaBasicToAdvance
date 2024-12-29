package org.example;

class CarFinal {
    final int noOfWheels;
    final String model;
    final String engineInLitres;

    public CarFinal(int noOfWheels, String model, String engineInLitres) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLitres = engineInLitres;
    }

    @Override
    public String toString() {
        return "CarFinal{" +
                "noOfWheels=" + noOfWheels +
                ", model='" + model + '\'' +
                ", engineInLitres='" + engineInLitres + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CarFinal car = new CarFinal(4, "SUV", "2.0");
        System.out.println(car);
    }
}