package org.example.challenge115;

import java.util.List;

public class Square {
    public static void main(String[] args) {
        List<String> numbers = List.of("1", "2", "3", "4", "5", "6");

        Integer sum = numbers.stream()
                .map(Integer::parseInt)
                .map(num -> num * num)
                .reduce(0 , Integer::sum);

        System.out.println(sum);
    }
}
