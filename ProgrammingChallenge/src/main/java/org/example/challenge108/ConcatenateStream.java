package org.example.challenge108;

import java.util.List;

public class ConcatenateStream {
    public static void main(String[] args) {
        List<String> namelist = List.of("Virat Kohli", "R Sharma", "Axar Patel", "M S Dhoni", "Ravi Jadeja");

        String concatenatedString = namelist.stream()
                .filter(name -> name.length() >= 10)
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(concatenatedString);
    }
}
