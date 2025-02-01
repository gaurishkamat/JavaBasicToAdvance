package org.example.challenge108;

import java.util.List;

public class ConcatenateStream {
    public static void main(String[] args) {
        List<String> namelist = List.of("Virat Kohli", "Rohit Sharma", "Axar Patel", "M S Dhoni", "Ravi Jadeja");

        namelist.stream()
                .filter(name -> name.length() >= 10)
                .forEach(name -> System.out.println(name));
    }
}
