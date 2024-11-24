package org.example;

import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers ");
        System.out.print("Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Number 2: ");
        int num2 = input.nextInt();
        System.out.print("Number 3: ");
        int num3 = input.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println(num1 + " is the greatest of all.");
            }
        }else if(num2 > num3){
            System.out.println(num2 + " is the greatest of all.");
        }else{
            System.out.println(num3 + " is the greatest of all.");
        }
    }
}
