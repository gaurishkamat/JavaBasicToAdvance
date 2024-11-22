package org.example;

import java.util.Scanner;

public class Challenge2Inputs {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to KG coding");
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        int result = num1 + num2;
        System.out.println("Addition: "+ result);
    }
}
