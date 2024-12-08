package org.example;

class IsPalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome array");
        int[] arr = ArrayUtility.inputArray();

        boolean isPalindrome = checkPalindrome(arr);

        if(isPalindrome){
            System.out.println("Given array is Palindrome");
        }else{
            System.out.println("Given array is not Palindrome");
        }
    }

    public static boolean checkPalindrome(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        while(i <= j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
