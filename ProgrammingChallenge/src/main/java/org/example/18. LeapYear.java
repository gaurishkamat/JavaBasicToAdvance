package org.example;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year: ");
        int year = input.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("It is a leap year");
        }else if(year % 100 == 0 && year % 400 == 0){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }
    }
}
