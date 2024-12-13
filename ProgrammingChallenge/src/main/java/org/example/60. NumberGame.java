package org.example;

import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guessing");

        int guess;
        int random;
        do{
            System.out.print("Enter a number between 1 to 10: ");
            guess = input.nextInt();
            random = (int) (Math.random()*10);
            System.out.println(random);
        }while(guess != random );

        System.out.println("Hooray you guessed it right!!");
    }
}
