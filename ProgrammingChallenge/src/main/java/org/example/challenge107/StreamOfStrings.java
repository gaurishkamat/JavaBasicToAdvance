package org.example.challenge107;

import java.util.List;

public class StreamOfStrings {
    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "Banana", "Mango", "Orange", "Pineapple");

        stringList.stream().forEach(fruit -> System.out.println(fruit));
    }
}
