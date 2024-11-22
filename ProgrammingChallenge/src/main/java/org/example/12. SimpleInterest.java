package org.example;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int amount = input.nextInt();
        System.out.print("Enter time in years: ");
        float time = input.nextFloat();
        System.out.print("Enter rate of interest: ");
        float interest = input.nextFloat();

        float simpleInterest = (amount * time * interest) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
