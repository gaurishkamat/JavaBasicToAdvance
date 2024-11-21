package org.example;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Values after swap:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}
