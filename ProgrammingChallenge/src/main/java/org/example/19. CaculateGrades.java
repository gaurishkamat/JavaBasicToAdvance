package org.example;

import java.util.Scanner;

class CalculateGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total marks:");
        float marks = input.nextFloat();

        if(marks >= 90){
            System.out.println("Congratulations!! You got grade A");
        }else if(marks >= 75){
            System.out.println("Congratulations!! You got grade B");
        }else if(marks >= 60){
            System.out.println("Congratulations!! You got grade C");
        }else if(marks >= 30){
            System.out.println("Congratulations!! You got grade D");
        }else{
            System.out.println("Unfortunately!! you have failed the exam!! Better luck next time.");
        }
    }
}
