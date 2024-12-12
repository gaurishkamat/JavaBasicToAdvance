package org.example;

import java.util.Scanner;

class MinOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find minimum of two");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

//        int min = num1 < num2 ? num1 : num2;
        int min = Math.min(num1, num2);
        System.out.println(min + " is the minimum of the two numbers entered");
    }
}
