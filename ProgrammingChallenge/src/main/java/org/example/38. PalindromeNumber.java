package org.example;

import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isPalindrome = isPalindrome(num);

        if(isPalindrome){
            System.out.println("your number is a Palindrome number");
        }else{
            System.out.println("your number is not a Palindrome number");
        }
    }

    public static boolean isPalindrome(int num){
        int reverseNum = reverse(num);
        return reverseNum == num;
    }

    public static int reverse(int num){
        int reverseNum = 0;
        while(num > 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        return reverseNum;
    }
}
