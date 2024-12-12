package org.example;

import java.util.Scanner;

class Absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Absolute number");

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int res = num > 0 ? num : num * -1;

        System.out.println("Absolute number is: " + res);
    }
}
