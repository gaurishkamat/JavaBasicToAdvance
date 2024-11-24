package org.example;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Odd or Even: ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println("You have entered an even number");
        }else{
            System.out.println("You have entered an odd number");
        }
    }
}
