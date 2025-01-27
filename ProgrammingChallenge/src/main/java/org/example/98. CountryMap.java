package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> countries = new HashMap<>();

        countries.put("India", "New Delhi");
        countries.put("United-States", "Washington");
        countries.put("Japan", "Tokyo");
        countries.put("Germany", "Frankfurt");
        countries.put("United-Kingdom", "London");


        for (String country : countries.keySet()) {
            System.out.printf("%s: %s\n", country, countries.get(country));
        }

        System.out.print("Enter a country: ");
        String country = input.next();

        if(countries.containsKey(country)){
            System.out.printf("Capital of %s is %s", country, countries.get(country));
        }else{
            System.out.println("Sorry we don't know the capital");
        }
    }
}
