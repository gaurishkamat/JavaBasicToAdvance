package org.example;

class MergeSortedArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to merging sorted arrays");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        int[] mergedArr = merge(arr1, arr2);
        ArrayUtility.displayArray(mergedArr);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        int i =0, j = 0, k = 0;

        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length || ( i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
            }else{
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        return newArr;
    }
}
