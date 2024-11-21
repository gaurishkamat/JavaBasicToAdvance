package org.example;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        int temperature = input.nextInt();
        float conversion = (temperature - 32) * (5.0f/9);
        System.out.print("Temperature is " + conversion + " degrees celsius");
    }
}
