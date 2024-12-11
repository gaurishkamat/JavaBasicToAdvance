package org.example;

class SumTwoDiagonal {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of array diagonals");

        int[][] numArr = ArrayUtility.input2DArray();

        int sum = sum(numArr);
        System.out.println("Sum of diagonals: " + sum);
    }

    public static int sum(int[][] numArr){
        if(numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;

        if(rows != cols){
            return 0;
        }

        int sum = 0;
        int i = 0;
        while(i<rows){
            int j = 0;
            while(j<cols){
                if(i == j || i + j == (rows -1)){
                    sum+= numArr[i][j];
                }
                j++;
            }
            i++;
        }

        return  sum;
    }
}
