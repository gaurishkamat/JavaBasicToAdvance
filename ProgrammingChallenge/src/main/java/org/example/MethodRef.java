package org.example;

import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = List.of("Moiez", "Girish", "Gaurish");

        StringBuilder str = new StringBuilder("Java Code");
        System.out.println(str.capacity());
        str.trimToSize();
        System.out.println(str.capacity());
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
