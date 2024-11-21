package org.example;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        System.out.println("Arithmetic Operations");
        int result = num1 + num2;
        System.out.println("Addition: " + result );
        result = num1 - num2;
        System.out.println("Subtraction: " + result );
        result = num1 * num2;
        System.out.println("Multiplication: " + result );
        result = num1 / num2;
        System.out.println("Division: " + result );
        result = num1 % num2;
        System.out.println("Remainder: " + result );
    }
}
