package org.example;

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = input.nextInt();
        System.out.println("Area of circle: " + (Math.PI * r * r));
        System.out.println("Circumference of circle: " + (2 * Math.PI * r));
    }
}
