package org.example;

import java.util.Scanner;

class Dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ch = "y";
        int random;
        while (ch.equalsIgnoreCase("y")){
            random = (int) Math.ceil(Math.random() * 6);
            System.out.println("you rolled!! : " + random);
            System.out.println("Enter Y to roll the DICE again, press N to stop");
            ch = input.next();
        }

    }
}
