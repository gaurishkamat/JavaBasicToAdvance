package org.example;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int amount = input.nextInt();
        System.out.print("Enter time in years: ");
        int time = input.nextInt();
        System.out.print("Enter rate of interest: ");
        int interest = input.nextInt();

        double simpleInterest = (double) (amount * time * interest) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
