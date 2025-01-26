package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();
        System.out.println("Please enter a string");
        String userString = input.next();

        for (char c : userString.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Unique characters in your string are %d", unique.size());
    }
}
