package org.example;

import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to password checker!!");

        String password;

        do{
            System.out.print("Enter password: ");
            password = input.next();
        }while(!isValid(password));

    }

    public static boolean isValid(String password){
        return password.length() > 6;
    }
}
