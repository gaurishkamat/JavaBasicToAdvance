package org.example;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        long factorial = getFactorial(num);

        System.out.println("Factorial of "+ num +" is: " + factorial);
    }

    public static long getFactorial(int num){
        long fact = 1;

        while(num > 1){
            fact *= num;
            num--;
        }
        return fact;
    }
}
