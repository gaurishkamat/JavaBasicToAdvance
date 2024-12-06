package org.example;

class CheckSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array sorting\n");
        int[] array = ArrayUtility.inputArray();

        boolean isInc = isIncreasing(array);
        boolean isDec = isDecreasing(array);

        if(isInc || isDec){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }

    }

    public static boolean isIncreasing(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr){

        int i = 1;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
