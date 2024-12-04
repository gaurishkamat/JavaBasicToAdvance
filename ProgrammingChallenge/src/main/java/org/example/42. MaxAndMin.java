package org.example;

import java.util.Scanner;

class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array::");

        int[] myArray = new int[5];
        for(int i=0;i<myArray.length;i++){
            myArray[i]=input.nextInt();
        }

        int min = getMinimun(myArray);
        System.out.println("Minimum value is:: "+ min);

        int max = getMaximum(myArray);
        System.out.println("Maximum value is:: "+ max);

    }

    public static int getMinimun(int[] array){
        int min =array[0];

        for(int _item:array){
            if(min > _item){
                min = _item;
            }
        }

        return min;
    }

    public static int getMaximum(int[] array){
        int max =array[0];

        for(int _item:array){
            if(max < _item){
                max = _item;
            }
        }

        return max;
    }
}
