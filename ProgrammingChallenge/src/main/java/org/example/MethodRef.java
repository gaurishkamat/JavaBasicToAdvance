package org.example;

import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = List.of("Moiez", "Girish", "Gaurish");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
