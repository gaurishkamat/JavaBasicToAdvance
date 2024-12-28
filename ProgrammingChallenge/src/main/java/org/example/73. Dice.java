package org.example;

import java.util.Scanner;

class Dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ch = "y";
        int random = 0;
        while (ch.equalsIgnoreCase("y")){
            random = (int) Math.floor(Math.random() * 6) + 1;
            System.out.println("you rolled!! : " + random);
            System.out.println("Enter Y to roll the DICE again, press N to stop");
            ch = input.next();
        }

    }
}
