package org.example;

class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse array");
        int[] array = ArrayUtility.inputArray();

        int[] reverseArr = reverseArray(array);
        System.out.println("Reverse array is: ");
        ArrayUtility.displayArray(reverseArr);
    }

    public static int[] reverseArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        int temp = 0;
        while(i <= j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
