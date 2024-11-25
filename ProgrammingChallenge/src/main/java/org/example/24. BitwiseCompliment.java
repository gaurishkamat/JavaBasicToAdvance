package org.example;

import java.util.Scanner;

class BitwiseCompliment {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int first = input.nextInt();

            int result = ~first;
            System.out.println("Bitwise compliment is: " + result);
        }
}
