package org.example;

import java.util.Scanner;

class OccurrenceOfNumber {
    public static void main(String[] args) {

        System.out.println("Welcome to occurrences");
        Scanner input = new Scanner(System.in);
        int[] numbers = ArrayUtility.inputArray();

        System.out.print("\nEnter the number to count: ");
        int findNum = input.nextInt();

        int occ = numberOfOccurrences(numbers, findNum);

        System.out.println("The number occurs " + occ + " times.");
    }

    public static int numberOfOccurrences(int[] numbers, int findNum){
        int i = 0;
        int count = 0;
        while(i < numbers.length){
            if(numbers[i] == findNum){
                count++;
            }
            i++;
        }

        return count;
    }
}
