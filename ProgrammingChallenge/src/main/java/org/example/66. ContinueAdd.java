package org.example;

import java.util.Scanner;

class ContinueAdd {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        int sum = addArray(arr);
        System.out.println("Total of numbers: " +sum);
    }

    public static int addArray(int[] arr){
        int sum = 0;
        for(int item: arr){
            if(item < 0){
                continue;
            }
            sum+= item;
        }
        return  sum;
    }
}
