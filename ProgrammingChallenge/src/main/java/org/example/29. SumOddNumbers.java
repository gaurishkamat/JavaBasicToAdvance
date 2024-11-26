package org.example;

import java.util.Scanner;

class SumOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();

        int sum = sumOddNumbers(num);

        System.out.println("Sum of odd numbers is " + sum);
    }

    public static int sumOddNumbers(int num){
        int result = 0;
        int i = 1;
        while(i<=num){
            if(i%2 !=0){
                result += i;
            }
            i++;
        }
        return result;
    }
}
