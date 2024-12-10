package org.example;

class SumAndAverage2D {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2d array");

        int[][] numArr = ArrayUtility.input2DArray();

        long sum = sum(numArr);
        double avg = average(numArr);

        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + avg);
    }

    public static long sum(int[][] numArr){
        long sum = 0;

        int i = 0;
        while(i<numArr.length){
            int j = 0;
            while(j<numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] numArr){
        if(numArr.length == 0){
            return  0;
        }

        int rows = numArr.length;
        int columns = numArr[0].length;

        double size = rows * columns;
        return sum(numArr)/ size;
    }
}
