package org.example;

import java.util.Arrays;
import java.util.List;

public class Unit2Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Gaurish", "Kamat", 35),
                new Person("Girish", "Kamat", 35),
                new Person("Pooja", "Kamat", 31),
                new Person("Moiez", "Shaikh", 31)
        );

        for(Person p: people){
            System.out.println("Display people in list:");
            System.out.println(p);
        }
    }
}
