package org.example;

import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();

        boolean isArmstrong = isArmstrong(num);

        if(isArmstrong){
            System.out.println("your number is an Armstrong number");
        }else{
            System.out.println("your number is not an Armstrong number");
        }
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num = num / 10;
        }
        return digits;
    }

    public static  int pow(int num1, int num2){
        int result = num1;
        int i = 1;
        while(i<num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static boolean isArmstrong(int num){
        int inputNum = num;
        int power = noOfDigits(num);
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            num /= 10;
            sum += pow(digit, power);
        }
        System.out.println(sum);
        return sum == inputNum;
    }
}
