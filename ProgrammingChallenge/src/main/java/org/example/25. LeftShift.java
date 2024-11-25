package org.example;

import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();

        int result = first<<1;
        System.out.println("Left shift number is: " + result);
    }
}