package org.example;

import java.util.Scanner;

class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication table");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        printTable(num);
    }

    public static void printTable(int num){
        for(int i = 1; i <= 10; i++ ){
            int res = num * i;
            System.out.println(num + " x " + i + " = " + res );
        }
    }
}
