package org.example;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        float amount = input.nextFloat();
        System.out.print("Enter time in years: ");
        float time = input.nextFloat();
        System.out.print("Enter rate of interest: ");
        double interest = input.nextFloat();

        double compoundInterest = (double) amount * (1 + (interest/100)) * time;

        System.out.println("Compound Interest: " + compoundInterest);
    }
}
