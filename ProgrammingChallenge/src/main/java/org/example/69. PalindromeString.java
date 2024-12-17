package org.example;

import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to string palindrome check");
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.println("Given string is " + (isPalindrome(str) ? "Palindrome" : "not Palindrome"));
    }

    public static boolean isPalindrome(String str){
        if(str.length() <=1){
            return true;
        }
        int lastPos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return  false;
        }
        String newStr = str.substring(1, lastPos);
        return  isPalindrome(newStr);
    }
}
