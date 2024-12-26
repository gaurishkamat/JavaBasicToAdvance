package org.example;

import java.util.Scanner;

class ConcatenateConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = input.next();
        System.out.print("Enter another string: ");
        String str2 = input.next();

        System.out.printf("%S", str1 + " " + str2);
    }
}
