package org.example.challenge109;

import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(number -> number%2 != 0)
                .forEach(number -> System.out.println(number));
    }
}
