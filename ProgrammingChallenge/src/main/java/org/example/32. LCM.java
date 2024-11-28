package org.example;

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        int lcm = getLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    public static int getLCM(int n1, int n2){
        int i = 1;
        while(i <= n2){
            int factor = i * n1;
            if( factor % n2 == 0){
                return i * n1;
            }
            i++;
        }
        return 0;
    }
}
