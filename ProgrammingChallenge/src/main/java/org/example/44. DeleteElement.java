package org.example;

import java.util.Scanner;

class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array deletion: ");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now, enter the number you want to delete: ");
        int del = input.nextInt();

        int[] newArr = deleteNumber(numArr, del);
        System.out.println("Here is your new array: ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] arr, int num){
        int occ = OccurrenceOfNumber.numberOfOccurrences(arr, num);

        if(occ == 0){
            return arr;
        }

        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;

        while(i<arr.length){
            if(arr[i] != num){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
