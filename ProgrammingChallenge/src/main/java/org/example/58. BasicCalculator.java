package org.example;

import java.util.Scanner;

class BasicCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Basic Calculator");
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            System.out.print("Enter operation to perform(+, -, *, /, %): ");
            String op = input.next();

            int result = switch (op){
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                case "%" -> num1 % num2;
                default -> -1;
            };

            System.out.println("Answer: " + result);
        }
}
