package org.example;

import java.util.Scanner;

class FindOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find occurrence in array");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = occurrence(arr, num);

        System.out.println("Given number found "+count+" time(s) in the array!");
    }

    public static int occurrence(int[] arr, int num){
        int count = 0;
        for(int item: arr ){
            if(item == num){
                count++;
            }
        }
        return count;
    }
}
