package org.example;

import java.util.Scanner;

class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int result = num & 1;

        if(result == 1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }
    }
}