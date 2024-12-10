package org.example;

import java.util.Scanner;

class SearchElement2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] numArr = ArrayUtility.input2DArray();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isFound = search(numArr, num);

        if(isFound){
            System.out.println("Your number was found");
        }else{
            System.out.println("Your number was not found");
        }
    }

    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while(i<numArr.length){
            int j = 0;
            while(j<numArr[i].length){
                if(numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
