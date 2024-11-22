package org.example;

import java.util.Scanner;

class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of triangle: ");
        int height = input.nextInt();
        System.out.print("Enter base of triangle: ");
        int base = input.nextInt();

        double areaTriangle = 0.5 * (base * height);

        System.out.println("Area of Triangle: " + areaTriangle);

    }
}
