package org.example;

import java.util.Scanner;

class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number > 0){
            System.out.println("Number is positive");
        }else if(number == 0){
            System.out.println("Number is zero");
        }else{
            System.out.println("Number is negative");
        }
    }
}
