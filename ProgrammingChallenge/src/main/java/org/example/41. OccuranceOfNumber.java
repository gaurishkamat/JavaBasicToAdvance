package org.example;

import java.util.Scanner;

class OccuranceOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;
        int sum = 0;
        while(i < numbers.length){
            sum += numbers[i];
            i++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (float) sum/numbers.length);
    }
}
