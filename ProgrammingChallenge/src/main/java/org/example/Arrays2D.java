package org.example;

import java.util.Scanner;

class Arrays2D {
    public static void main(String[] args) {
        int[][] numbers2D = new int[3][3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int i = 0;
        while(i < 3){
            int j = 0;
            while (j < 3){
                numbers2D[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        System.out.println("Numbers in array are: ");

        i = 0;
        while(i < 3){
            int j = 0;
            while (j < 3){
                System.out.println(" " + numbers2D[i][j]);
                j++;
            }
            i++;
        }
    }
}
