package org.example;

import java.util.Scanner;

class Subscribe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Welcome " + name + ", subscribe to KG coding!");
    }
}
