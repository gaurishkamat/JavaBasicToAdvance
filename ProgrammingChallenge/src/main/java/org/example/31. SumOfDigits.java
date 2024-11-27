package org.example;

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int res = sumDigits(num);
        System.out.println("Sum of digits of the number "+ num + " is: " + res);
    }

    public static int sumDigits(int num){
        int sum = 0;
        while( num !=0){
            sum+= num % 10;
            num = num / 10;
        }
        return sum;
    }
}
