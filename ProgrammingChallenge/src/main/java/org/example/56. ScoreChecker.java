package org.example;

import java.util.Scanner;

class ScoreChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Score checker");

        System.out.print("Enter your marks out of 100: ");
        int marks = input.nextInt();

        String score = (marks > 80) ? "High" : (marks > 50 && marks < 80) ? "Moderate" : "Low";
        System.out.println("Your marks are " + score);
    }
}
