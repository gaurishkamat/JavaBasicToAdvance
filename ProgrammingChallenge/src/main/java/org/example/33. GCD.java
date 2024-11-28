package org.example;

import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        int gcd = getGCD(num1, num2);
        System.out.println("GCD for " + num1 + " & " + num2 + " is " + gcd);
    }

    public static int getGCD(int num1, int num2){
        int i = 2;
        int gcd = 1;
        while(i <= least(num1, num2)){
            if( num1 % i == 0 && num2 % i == 0 ){
                gcd = i;
            }
            i++;
        }

        return  gcd;
    }

    public static int least(int n1, int n2){
        return Math.min(n1, n2);
    }
}
