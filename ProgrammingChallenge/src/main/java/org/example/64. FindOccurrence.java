package org.example;

import java.util.Scanner;

class FindOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find occurrence in array");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter aumber: ");
        int num = input.nextInt();

        int count = occrrence(arr, num);
    }

    public static int occrrence(int[])
}
