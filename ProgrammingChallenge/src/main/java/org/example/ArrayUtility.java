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

    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter no. of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter no. of columns: ");
        int columns = input.nextInt();

        System.out.println("Enter the array elements");
        int[][] numArr = new int[rows][columns];

        int i = 0;
        int j = 0;

        while (i < rows){
            while (j < columns) {
                System.out.print("Please enter element no [" + (i + 1) + "][" + (j + 1) + "]: ");
                numArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArr;

    }
}
