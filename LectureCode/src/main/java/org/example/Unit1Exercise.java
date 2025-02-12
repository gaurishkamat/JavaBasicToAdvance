package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("John", "Doe", 30),
                new Person("Jane", "Doe", 28),
                new Person("Jake", "Paul", 35),
                new Person("Leo", "Drake", 27)
        );


        //write a method to sort the people using lastname

        people.sort(Comparator.comparing(Person::getLastname));


        //write a method to print all the people

        printAllPeople(people);

        //write a method to print all the people whose lastname starts with C
    }

    public static void printAllPeople(List<Person> people){
        for(Person p: people){
            System.out.println(p);
        }
    }
}
