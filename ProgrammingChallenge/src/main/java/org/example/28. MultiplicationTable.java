package org.example;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        getTable(num);
    }

    public static void getTable(int num){
        int i =  1;
        while(i<=10){
            int result = i * num;
            System.out.println(num + " x " +i + " = " + result);
            i++;
        }
    }
}
