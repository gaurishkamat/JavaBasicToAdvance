package org.example.challenge85;

public class Calculate {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(1, 2));

        System.out.println(cal.add(1, 2, 3));

        System.out.println(cal.add(5.0, 6.2));
    }
}
