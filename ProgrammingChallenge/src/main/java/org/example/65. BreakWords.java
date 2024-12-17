package org.example;

import java.util.Scanner;

class BreakWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Break");

        while(true){
            System.out.println("Enter your command: ");
            String command = input.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("You have successfully exit");
    }
}
