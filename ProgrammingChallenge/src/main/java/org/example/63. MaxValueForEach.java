package org.example;

class MaxValueForEach {
    public static void main(String[] args) {
        System.out.println("Check max number from an array");
        int[] arr = ArrayUtility.inputArray();
        int num = getMax(arr);
        System.out.println(num + " is the max of all numbers in the array");
    }

    public static int getMax(int[] arr){
        if(arr.length < 1){
            return 0;
        }
        int max = arr[0];

        for(int num: arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
