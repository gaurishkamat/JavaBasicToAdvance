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

            switch (op){
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                case "%":
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
}
