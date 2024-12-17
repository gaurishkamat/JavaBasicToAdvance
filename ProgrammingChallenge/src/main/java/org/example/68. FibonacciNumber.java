package org.example;

import java.util.Scanner;

class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to print Fibonacci series: ");
        int num = input.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println(printFibonacci(i) + " ");
        }
    }

    public static int printFibonacci(int num){
        if(num == 0){
            return 0;
        }

        if(num == 1){
            return 1;
        }

        return printFibonacci(num - 1) + printFibonacci(num - 2);
    }
}
