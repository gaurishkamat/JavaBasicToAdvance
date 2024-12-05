package org.example;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] numArr = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("Please enter element no " + (i+1) + ": ");
            numArr[i] = input.nextInt();
            i++;
        }
        return numArr;
    }
}
