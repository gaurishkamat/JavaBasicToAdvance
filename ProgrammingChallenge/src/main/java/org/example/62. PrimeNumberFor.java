package org.example;

import java.util.Scanner;

class PrimeNumberFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime checker");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Given number is Prime");
        }else{
            System.out.println("Given number is not Prime");
        }
    }

    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++ ){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
