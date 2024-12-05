package org.example;

class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to array sum and average: ");
        int[] numArray = ArrayUtility.inputArray();

        int sum = 0;
        int i = 0;

        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (float) sum/numArray.length);
    }
}
