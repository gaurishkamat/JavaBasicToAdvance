package org.example.challenge84;

public class TestFly {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        System.out.printf("I am %s\n", eagle.getBreed());
        eagle.fly();
    }
}
