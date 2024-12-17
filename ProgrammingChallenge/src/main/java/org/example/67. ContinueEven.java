package org.example;

class ContinueEven {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        printEven(arr);
    }

    public static void printEven(int[] arr){
        for(int item: arr){
            if(item % 2 != 0){
                continue;
            }
            System.out.print(item + " ");
        }
    }
}
