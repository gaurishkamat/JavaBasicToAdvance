package org.example;

import java.util.Scanner;

class PrintPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");

        int rows = input.nextInt();

        printRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);
        printRightHalfInversePyramid(rows);

    }

    public static void printRightHalfPyramid(int maxRows){
        for(int i=0;i<maxRows;i++){
            for(int j=0;j<maxRows;j++){
                if(j<=i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printLeftHalfPyramid(int maxRows){
        for(int i=0;i<maxRows;i++){
            for(int j=0;j<maxRows;j++){
                if((i+j)>=maxRows-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printRightHalfInversePyramid(int maxRows){
        for(int i=0;i<maxRows;i++){
            for(int j=0;j<maxRows;j++){
                if(i<=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
