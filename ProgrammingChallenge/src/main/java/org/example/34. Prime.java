package org.example;

import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        isPrime(num1);
    }

    public static void isPrime(int num1){
        int i = 1;
        int prime = 0;
        while(i < num1 && (num1 % i) == 0){
            prime++;
            i++;
        }

        if(prime<=1){
            System.out.println(num1 + " is a prime number");
        }
    }
}
