package org.example;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find if a number is even or odd");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        String evenOdd = num % 2 == 0 ? "Even" : "Odd";

        System.out.println("The given number is " + evenOdd);
    }
}
