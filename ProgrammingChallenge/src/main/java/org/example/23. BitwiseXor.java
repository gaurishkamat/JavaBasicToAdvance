package org.example;

import java.util.Scanner;

class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Bitwise xor is: " + result);
    }
}