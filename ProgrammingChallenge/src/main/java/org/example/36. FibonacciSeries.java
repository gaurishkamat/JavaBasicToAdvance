package org.example;

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        printFibonacci(num);
    }

    public static void printFibonacci(int num){

        if (num < 0) return;

        int num1 = 0, num2 = 1;

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        while(num1 + num2 <= num) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
