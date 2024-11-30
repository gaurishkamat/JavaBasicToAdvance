package org.example;

import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reverse = getReverse(num);

        System.out.println("Reverse number is: " + reverse);
    }

    public static int getReverse(int num){
        int reverseNum = 0;
        while(num > 0){
            reverseNum = reverseNum * 10 + (num % 10);
            num /= 10;
        }
        return reverseNum;
    }
}
