package org.example;

import java.util.Scanner;

class PerimeterRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int length = input.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = input.nextInt();

        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }


}
