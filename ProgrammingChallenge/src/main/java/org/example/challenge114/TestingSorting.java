package org.example.challenge114;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employess = List.of(

                new Employee("Pooja", 8000000),
                new Employee("Moiez", 6000000),
                new Employee("Gaurish", 5000000),
                new Employee("Girish", 6000000)
        );

        employess.stream()
                .sorted( (emp1,emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
